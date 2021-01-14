package strategy.after;

public class MyProgram {

	private SearchButton searchButton = new SearchButton();

	public void setModeAll() {
		searchButton.setSearchStrategy(new SearchStrategyAll());
	}

	public void setModeImage() {
		searchButton.setSearchStrategy(new SearchStrategyImage());
	}

	public void setModeNews() {
		searchButton.setSearchStrategy(new SearchStrategyNews());
	}

	public void setModeMap() {
		searchButton.setSearchStrategy(new SearchStrategyMap());
	}

	public void testProgram() {
		searchButton.onClick(); // "SEARCH ALL" 출력
		setModeImage(); // 이미지검색 모드로
		searchButton.onClick(); // "SEARCH IMAGE" 출력
		setModeNews(); // 뉴스검색 모드로
		searchButton.onClick(); // "SEARCH NEWS" 출력
		setModeMap(); // 지도검색 모드로
		searchButton.onClick(); // "SEARCH MAP" 출력
	}
}
