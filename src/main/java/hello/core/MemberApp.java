package hello.core;

import hello.core.domain.member.Grade;
import hello.core.domain.member.Member;
import hello.core.service.MemberService;

public class MemberApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("Member : " + member.getName());
        System.out.println("findMember : " + findMember.getName());
    }
}