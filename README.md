# Delivery / 프로젝트 이름

**[뱃지나 프로젝트에 관한 이미지들이 이 위치에 들어가면 좋습니다]**  
Java 객체지향 디자인 패턴 학습을 위한 Repository입니다.

https://www.yalco.kr/29_oodp_1/
에서 배운 내용들을 학습하고, 새롭게 적용해 보고 있습니다.

## Getting Started / 어떻게 시작하나요?

https://www.yalco.kr/29_oodp_1/

### Prerequisites / 선행 조건

Java

▼ 학습내용 코드 샘플

```
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

```

### Installing / 설치

아래 사항들로 현 프로젝트에 관한 모듈들을 설치할 수 있습니다.

```
readme 수정 후 배포하기
```

## Running the tests / 테스트의 실행

어떻게 테스트가 이 시스템에서 돌아가는지에 대한 설명을 합니다

### 테스트는 이런 식으로 동작합니다

왜 이렇게 동작하는지, 설명합니다

```
readme 수정 후 배포하기
```

### 테스트는 이런 식으로 작성하시면 됩니다

```
예시
```

## Deployment / 배포

Add additional notes about how to deploy this on a live system / 라이브 시스템을 배포하는 방법

## Built With / 누구랑 만들었나요?

* [이름](링크) - 무엇 무엇을 했어요
* [Name](Link) - Create README.md

## Contributiong / 기여

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us. / [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) 를 읽고 이에 맞추어 pull request 를 해주세요.

## License / 라이센스

This project is licensed under the MIT License - see the [LICENSE.md](https://gist.github.com/PurpleBooth/LICENSE.md) file for details / 이 프로젝트는 MIT 라이센스로 라이센스가 부여되어 있습니다. 자세한 내용은 LICENSE.md 파일을 참고하세요.

## Acknowledgments / 감사의 말

* Hat tip to anyone whose code was used / 코드를 사용한 모든 사용자들에게 팁
* Inspiration / 영감
* etc / 기타
