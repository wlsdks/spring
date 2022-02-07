package com.project.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.project.board.dao.Board;
import com.project.board.dao.Reply;

@MapperScan(basePackageClasses = Board.class)
@MapperScan(basePackageClasses = Reply.class)
@MapperScan(basePackages = "com.project.board")
@SpringBootApplication
public class BoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardApplication.class, args);
	}

}
