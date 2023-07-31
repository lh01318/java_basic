package ezen.test;

public class Student {
	private String name;
    private int koreanScore;
    private int englishScore;
    
    public Student(String name, int koreanScore, int englishScore) {
        this.name = name;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKoreanScore() {
        return koreanScore;
    }

    public void setKoreanScore(int koreanScore) {
        this.koreanScore = koreanScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }
    
    
    public int total() {
        return koreanScore + englishScore;
    }

    @Override
    public String toString() {
    	
    	return super.toString();
    }

}


