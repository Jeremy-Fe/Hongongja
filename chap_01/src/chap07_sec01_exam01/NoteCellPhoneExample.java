package chap07_sec01_exam01;

public class NoteCellPhoneExample {
	public static void main(String[] args) {
		NoteCellPhone note = new NoteCellPhone("갤럭시 노트", "검정") ;
		
		System.out.println("모델: " + note.model);
		System.out.println("색상: " + note.color);
		
		note.powerOn();
		note.bell();
		note.sendVoice("여보세요.");
		note.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		note.sendVoice("아~ 예 반갑습니다.");
		note.hangUp();
		
		note.takePen();
		note.Pendraw();
		note.putPen();
		
		
	}
}
