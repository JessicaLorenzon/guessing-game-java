package service;

public class LevelHard implements Level {

	@Override
	public String getTextDifficulty() {
		return "Hard";
	}

	@Override
	public Integer getNumberAttempts() {
		return 3;
	}

}
