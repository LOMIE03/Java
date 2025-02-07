public class BoardExample {
    public static void main(String[] args) {
        Board board1 = new Board(null , null, "로그인한 회원아이디" , "현재 컴퓨터 날짜", 0);
        Board board2 = new Board(null , null , null ,"현재 컴퓨터 날짜" , 0);
        Board board3 = new Board(null , null ,null  , "현재 컴퓨터 날짜" , 0);
        Board board4 = new Board(null, null, null,null , 0);


        System.out.println(board1.title + board2.title + board3.title + board4.title);
        System.out.println(board1.content + board2.content + board3.content + board4.content);
        System.out.println(board1.writer + board2.writer + board3.writer + board4.writer);
        System.out.println(board1.date + board2.date + board3.date + board4.date);
        System.out.println(board1.hitcount + board2.hitcount + board3.hitcount + board4.hitcount);
    }
}
