package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

// 오라클 데이터 베이스에 연결하고 select, insert , update, delete 작업을 실행해주는 클래스
public class MemberDAO {

	/* 오라클 접속하는 소스 */
	String id = "system"; // 접속 아이디
	String pass = "pass"; // 비
	String url = "jdbc:oracle:thin:@localhost:1521/xe"; // 접속 url

	// 데이터베이스에 접근할 수 있도록 설정
	Connection con = null;

	// 데이터 베이스에서 쿼리를 실행시켜주는 객체
	PreparedStatement pstmt = null;

	// 데이터베이스의 테이블의 결과를 리턴받아 자바에 저장해주는 객체
	ResultSet rs = null;

	// 데이터 베이스에 접근할 수 있도록 도와주는 메소드
	public Void getCon() {

		try {
			/* 1. 해당 데이터 베이스르 사용한다고 선언 (클래스를 등록 = 오라클용을 사용) */
			Class.forName("oracle.jdbc.driver.OracleDriver");

			/* 2. 해당 데이터 베이스에 접속 */
			con = DriverManager.getConnection(url, id, pass);

		} catch (Exception e) {

		}
		return null;

	}
	
	
	// 데이터 베이스에 한사람의 회원 정보를 저장해주는 메소드
	public void insertMember(MemberBean mbean) {

		  try {
			  getCon();
			  /* 3. 접속 후 쿼리준비하여 쿼리를 사용하도록 설정 */
			 	String sql="insert into member values(?,?,?,?,?,?,?,?)";
			  
			  /* 쿼리를 사용하도록 설정 */
			  pstmt = con.prepareStatement(sql);
			  
			  /* ?에 맞게 데이터를 맵핑 */
			  pstmt.setString(1,mbean.getId());
			  pstmt.setString(2,mbean.getPassword());
			  pstmt.setString(3,mbean.getEmail());
			  pstmt.setString(4,mbean.getTel());
			  pstmt.setString(5,mbean.getHobby());
			  pstmt.setString(6,mbean.getJob());
			  pstmt.setString(7,mbean.getAge());
			  pstmt.setString(8,mbean.getInfo());
			  
			  /* 4. 오라클에서 쿼리를 실행하기 */
			  pstmt.executeUpdate(); /* insert, update, delete 시 사용하는 메소드 */
			  
			  /* 5.자원 반납 */
			  con.close();
			  
		  } catch(Exception e){
			  e.printStackTrace();
		  }
		  
	}
	
	
	// 모든 회원의 정보를 리턴해주는 메소드 
	//return type : Vector<MemberBean> 
	
	public Vector<MemberBean> allSelectMember() {
		// 가변길이로 데이터를 저장한다.
		Vector<MemberBean> v = new Vector<>();
		
		// 무조건 데이터베이스, 스레드, 입출력(IO), 네트워크와 같은 패키지에서 메소드를 사용할 때는 반드시 에러 처리를 해야 합니다. 
		try {
			// 커넥션 연결 
			getCon();
			
			// 쿼리 준비 
			String sql = "select * from member;";
			// 쿼리를 실행시주는 객체 선언
			pstmt = con.prepareStatement(sql);
			// 쿼리를 실행시킨 결과를 리턴해서 받아줌 (오라클 테이블의 검색된 결과를 자바객체(ResultSet)에 저장)
			// -> ResultSet에 결과를 저장
			rs = pstmt.executeQuery();
			
			// 반복문을 이용하여 rs에 저장된 데이터를 추출하기
			
			// 조건 : 저장된 데이터 만큼 반복문을 돌리겠다.     
			while(rs.next()) {
				
				// 모든 회원 정보를 메모리에 저장하는 역할 - 컬럼으로 나뉜 데이터를 빈 클래스에 저장한다.
				MemberBean bean = new MemberBean();
				
				bean.setId(rs.getString(1));
				bean.setPassword(rs.getString(2));
				bean.setEmail(rs.getString(3));
				bean.setTel(rs.getString(4));
				bean.setHobby(rs.getString(5));
				bean.setAge(rs.getString(6));
				bean.setJob(rs.getString(7));
				bean.setInfo(rs.getString(8));
				
				// 패키징된 memberBean 클래스를 백터에 저장
				// 0번 인덱스 부터 순서대로 데이터 저장 
				v.add(bean);
				
			}
			
			// 자원 반납 - 데이터베이스 연 종료
			con.close();
			
		} catch (Exception e) {
			
			
		}
		// 모든 데이터가 저장된 백터를 반환함
		// 반환되 객체는 데이터베이스에서 조회된 모든 회원 정보를 포함하며, 이후의 웹 페이지에 정보 출력에 사용	
		return v;
	}
	
}
