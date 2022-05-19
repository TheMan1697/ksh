package com.javman.mapper;

import com.javman.domain.Member;


public interface MemberMapper {
	Member read(String userid);
	
	int insertMember(Member vo);
	
}
