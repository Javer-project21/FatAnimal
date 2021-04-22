package fatAnimal;

public class PrintScript {
	public String start = "동물 친구 살찌우기 게임\n\n\n게임규칙\n 1. 동물 친구를 10kg을 찌우면  성공~!\n 2. 밥을 3번 먹으면 꼭 취미활동을 1번 해야해~!\n 3. 안 그럼 화낸당!!\n\n\n 함께할 동물 친구를 골라볼래? (한 마리만 가능)\n\n\n";

	public String hello(String name) {
		return String.format("안녕? 난 %s이야! 만나서 반가워!\n나에게 무엇을 해줄꼬야?\n1. 밥\n2. 잠\n3. 똥\n4. 취미활동\n\n\n", name);
	}
	
	/*
	public String eating(String name, String character, int fat, int weight) {
		return String.format("%s : 냠냠냠~ 맛있당! ^^ %s\n<알림> %s가 1kg 쪘어요~!\n<알림> 지금까지 %dkg 쪘어요~!", name, character, fat, weight);
	}
	
	public String sleeping(String name, String character, int fat, int weight) {
		return String.format("%s : 쿨쿨~zZZ %s\n<알림> %s가 0.5kg 빠쪘어요~!\n<알림> 지금까지 %dkg 쪘어요~!", name, character, fat, weight);
	}
		
	public String pooping(String name, String character, int fat, int weight) {
		return String.format("%s : 끄읍…..><;;; 아이~ 시원해~^0^~☆ %s\n<알림> %s가 0.5kg 빠쪘어요~!\n<알림> 지금까지 %dkg 쪘어요~!", name, character, fat, weight);
	}
	
	public String doHobby() {
		return "!!!! 취미활동할래 !!!! \n !!!삐질꼬야!!!\n !!!나뽀 나뽀 나뽀!!!\n !!!얼릉 얼릉 취미활동 시켜죠!!!\n";
	}
	
	public String choice4Apple(String name, String character, int fat, int weight) {
		return String.format("%s : 나비보벳따우~♬ 아이 신나~! ^^~♬ %s\n<알림> %s가 1kg 빠쪘어요~!\n<알림> 지금까지 %dkg 쪘어요~!", name, character, fat, weight);
	}
	
	public String choice4Joonie(String name, String character, int fat, int weight) {
		return String.format("%s : 슥샥~슥샥~슥샥~♬ 나는야 천재 화가~! ^^~♬ %s\n<알림> %s가 1kg 빠쪘어요~!\n<알림> 지금까지 %dkg 쪘어요~!", name, character, fat, weight);
	}
	
	public String choice4Cutie(String name, String character, int fat, int weight) {
		return String.format("%s : 뒤뚱뒤뚱~♬ 아이 오늘도 날씨가 참 좋아~! ^^~♬ %s\n<알림> %s가 1kg 빠쪘어요~!\n<알림> 지금까지 %dkg 쪘어요~!", name, character, fat, weight);
	}
	*/
	
}
