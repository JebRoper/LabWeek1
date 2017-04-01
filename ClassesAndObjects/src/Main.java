public class Main {

    public static void main(String[] args) {

        Member member = new Member("Jane Doe", "123 High St", null,
                "Austin", "TX", "789701", "1999-04-22");
        System.out.println(member);

        System.out.println("before changing zip " + member.getZip());
        member.setZip("78733");
        System.out.println("after changing zip " + member.getZip());


    }


}
