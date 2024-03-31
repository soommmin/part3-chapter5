## part3-chapter5

# 미디어 검색 앱

<img src="https://github.com/soommmin/part3-chapter5/assets/150005268/2fbe13e4-347b-410e-94aa-8f1262a1ac29" width="200" height="400"/>
<img src="https://github.com/soommmin/part3-chapter5/assets/150005268/da7f297c-ed71-43c2-ae67-cad7b177ec90" width="200" height="400"/>


미디어 검색 앱은 카카오 API를 사용하여 원하는 내용을 검색하고 관련 정보를 확인할 수 있는 애플리케이션입니다. 실시간 업데이트를 위해 LiveData를 활용하였습니다. 또한 MVVM 아키텍처 패턴을 적용하여 UI와 비즈니스 로직을 분리하여 유지보수성과 확장성을 높였습니다.


## What I Learned
1. [MVVM](https://ko.wikipedia.org/wiki/%EB%AA%A8%EB%8D%B8-%EB%B7%B0-%EB%B7%B0%EB%AA%A8%EB%8D%B8)
     - MVVM은 Model-View-ViewModel의 약자로, 소프트웨어 개발에서 사용되는 아키텍처 패턴 중 하나입니다. 이 패턴은 UI 레이어와 비즈니스 로직을 분리하여 유지보수성을 향상시키고, 코드의 가독성과 재사용성을
       높이기 위한 목적으로 활용됩니다.
     - Model: 애플리케이션의 데이터와 비즈니스 로직을 담당합니다. 데이터를 가져오고 조작하는 역할을 수행하며, 주로 데이터베이스, 네트워크 API 호출, 로컬 파일 등을 통해 데이터를 관리합니다.
     - View: 사용자 인터페이스를 표시하고 사용자의 입력을 받는 역할을 합니다. 화면에 보이는 요소들을 담당하며, 사용자가 보는 것을 나타냅니다. Android 앱의 경우 XML 레이아웃 파일로 표현될 수 있습니다.
     - ViewModel: View와 Model 간의 중간 매개체로, 비즈니스 로직을 처리하고 View에 표시될 데이터를 준비하는 역할을 합니다. View에서 필요한 데이터를 관리하고, View에게 제공하여 화면을 업데이트합니다.       
2. [LiveData](https://developer.android.com/topic/libraries/architecture/livedata?hl=ko)
     - LiveData는 안드로이드 아키텍처 컴포넌트 중 하나로, 수명 주기를 인식하는 데이터 홀더 클래스입니다. 이를 통해 앱의 데이터를 관리하고, UI 컴포넌트(예: 화면)에 변경 사항을 통지하여 UI를 업데이트할 수
       있습니다. LiveData는 주로 MVVM 아키텍처에서 ViewModel과 함께 사용되어 UI와 비즈니스 로직 간의 통신을 간편하게 만들어줍니다.
3. [Retrofit](https://square.github.io/retrofit/)
4. [RX](https://github.com/ReactiveX/RxKotlin)
     - 안드로이드에서 RxJava를 사용하면 비동기 작업 처리, UI 스레드 관리, 이벤트 처리 등을 보다 간단하고 효율적으로 구현할 수 있으며, 코드의 가독성과 유지보수성을 향상시킬 수 있습니다.
5. [Debounce](https://reactivex.io/documentation/operators/debounce.html)
     - 주로 검색 기능이나 사용자가 입력한 텍스트를 처리할 때 사용됩니다. Debounce는 입력 이벤트가 발생할 때 일정 시간 동안 추가 입력을 무시함으로써 의도하지 않은 다중 요청을 방지하고, 네트워크 또는 다른 비용이        많이 드는 작업을 효율적으로 관리하는 데 도움이 됩니다.
6. [Zip](https://reactivex.io/documentation/operators/zip.html)
     - 일반적으로 zip 연산자는 여러 개의 비동기 작업을 병렬로 수행하고, 각 작업의 결과를 조합하여 새로운 결과를 생성하는 데 사용됩니다. 이는 특히 여러 개의 네트워크 요청을 병렬로 처리하고, 모든 요청이 완료되면         그 결과를 합치는 데 유용합니다.
7. [Mockito](https://developer.android.com/training/testing/unit-testing/local-unit-tests?hl=ko)
     - 안드로이드에서 Mockito를 사용하면 의존성 주입(Dependency Injection)을 통해 테스트 가능한 코드를 작성할 수 있으며, 테스트 케이스를 통해 안드로이드 애플리케이션의 동작을 안정적으로 검증할 수 있습니         다. Mockito를 사용하여 테스트를 작성하면 코드의 품질을 향상시키고 애플리케이션의 신뢰성을 높일 수 있습니다.



