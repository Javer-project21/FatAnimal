package fatAnimal;

public class Apple extends Animal{
	public Apple() {
		super("애플이", "햄스터", "핑크", "큐릉~!^^", "노래부르기");
	}
	
	@Override
	public String hobbing() {
		return "나비보벳따우~♬ 아이 신나~!";
	}
}
