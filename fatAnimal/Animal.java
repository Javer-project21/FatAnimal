package fatAnimal;

public class Animal {
	private String aName;
	private String aType;
	private String aColor;
	private String aCharacter;
	private String aHoby;
	private float aFat = 0;
	
	public Animal(String aName, String aType, String aColor, String aCharacter, String aHoby) { 
		this.aName = aName;
		this.aType = aType;
		this.aColor = aColor;
		this.aCharacter = aCharacter;
		this.aHoby = aHoby;
	}
	
	@Override
	public String toString() {
		return String.format(("♡ %s ♡ | 동물 : %s | 색깔 : %s | 습관 : %s | 취미 : %s"), aName, aType, aColor, aCharacter, aHoby);
	}
	
	public String eating() {
		this.aFat += 1;
		if (this.aFat < 0) {this.aFat = 0;}
		return String.format("%s : 냠냠냠~ 맛있당! ^^ %s\n<알림> %s가 1kg 쪘어요~!\n<알림> 지금까지 %.1fkg 쪘어요~!", aName, aCharacter, aName, this.aFat);
	}
	
	public String sleeping() {
		this.aFat -= 0.5;
		if (this.aFat < 0) {this.aFat = 0;}
		return String.format("%s : 쿨쿨~zZZ %s\n<알림> %s가 0.5kg 빠쪘어요~!\n<알림> 지금까지 %.1fkg 쪘어요~!", aName, aCharacter, aName, this.aFat);
	}
	
	public String pooping() {
		this.aFat -= 0.5;
		if (this.aFat < 0) {this.aFat = 0;}
		return String.format("%s : 끄읍…..><;;; 아이~ 시원해~^0^~☆ %s\n<알림> %s가 0.5kg 빠쪘어요~!\n<알림> 지금까지 %.1fkg 쪘어요~!", aName, aCharacter, aName, this.aFat);
	}
	
	public void doHobby() {
		System.out.println("\n\n!!!! 취미활동할래 !!!! \n !!!삐질꼬야!!!\n !!!나뽀 나뽀 나뽀!!!\n !!!얼릉 얼릉 취미활동 시켜죠!!!\n");
	}
	
	public String hobbing() {
		return "";
	}
	
	public String hobby() {
		this.aFat -= 1;
		if (this.aFat < 0) {this.aFat = 0;}
		return String.format("%s : %s ^^~♬ %s\n<알림> %s가 1kg 빠쪘어요~!\n<알림> 지금까지 %.1fkg 쪘어요~!", aName, this.hobbing(), aCharacter, aName, this.aFat);
	}

	public String getaName() {
		return aName;
	}

	public String getaType() {
		return aType;
	}

	public String getaColor() {
		return aColor;
	}

	public String getaCharacter() {
		return aCharacter;
	}

	public String getaHoby() {
		return aHoby;
	}

	public float getaFat() {
		return aFat;
	}

	
}

