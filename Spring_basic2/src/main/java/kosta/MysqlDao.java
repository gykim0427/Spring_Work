package kosta;

import org.springframework.stereotype.Repository;

//@Repository
public class MysqlDao implements Dao {

	@Override
	public void insertBoard() {
		System.out.println("MysqlDao InsertBoard()호출" );

	}

}
