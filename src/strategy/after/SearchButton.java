package strategy.after;

public class SearchButton {
	
	private SearchStrategy searchStrategy = new SearchStrategyAll(); // 천 선언은 All로 지정

	public void setSearchStrategy(SearchStrategy searchStrategy) { // setting을 할때마다 새로운 전략 갈아끼우기
		this.searchStrategy = searchStrategy;
	}
	
	public void onClick() {
		searchStrategy.search();
	}
	
}
