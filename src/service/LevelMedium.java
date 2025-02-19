package service;

public class LevelMedium implements Level {

	@Override
	public String getTextDifficulty() {
		return "Medium";
	}

	@Override
	public Integer getNumberAttempts() {
		return 5;
	}

}
