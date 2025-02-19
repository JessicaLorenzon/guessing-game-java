package service;

public class LevelEasy implements Level {

	@Override
	public String getTextDifficulty() {
		return "Easy";
	}

	@Override
	public Integer getNumberAttempts() {
		return 10;
	}

}
