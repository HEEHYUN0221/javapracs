## 계산기 만들기
<details>
    <summary>자세히</summary>
  
- - -
### 1. 첫번째 계산기 (절차지향)

* 입력 : 양의 정수를 입력받고, 'Scanner' 클래스를 사용해 사칙연산 기호를 입력받아 계산을 수행합니다.

* 오류 처리 : 잘못된 입력이나 오류가 발생할 경우, 해당 오류 메시지를 출력합니다. 특히 나눗셈에서 분모가 0일 경우 "분모가 0이 될 수 없습니다."를 출력합니다.

* 특징 : 기본적인 사칙연산(덧셈,뺄셈,곱셈,나눗셈)을 지원합니다.

[코드 보기 - cal1](https://github.com/HEEHYUN0221/javapracs/tree/main/cal1)

- - -

### 2. 두번째 계산기

* 설계 : 각 사칙연산(덧셈, 뺄셈, 곱셈, 나눗셈)을 별도의 클래스로 분리하고, 'Calculator' 클래스에서 이를 사용할 수 있도록 설계했습니다.

* 입력 관리 : 'Queue' 자료 구조를 사용하여 연산 기록을 저장합니다.

* 기능 추가 : 가장 먼저 저장된 데이터를 삭제하는 메소드를 'Queue'를 활용해 구현했습니다.

* 캡슐화 : 필드에 직접 접근하지 않도록 'Getter'와 'Setter' 메소드를 구현하여 데이터 보호를 강화했습니다.

* 오류 처리 : 첫 번째 버전과 마찬가지로 오류 처리를 통해 잘못된 입력에 대한 예외 메시지를 출력합니다.

[코드 보기 - cal2](https://github.com/HEEHYUN0221/javapracs/tree/main/cal2)

- - -

### 3. 세번째 계산기 (제네릭, ENUM 활용)

* 입력 : 'double' 타입의 숫자를 입력받아 보다 정밀한 계산이 가능합니다.

* 연산자 관리 : 기존의 사칙연산 기호 대신, ENUM 타입을 사용하여 연산자를 관리합니다. 사용자는 'ADD', 'SUB', 'MUL','DIV'와 같은 키워드를 대소문자 구분 없이 입력할 수 있습니다.

* 사칙연산 통합 : 별도의 클래스로 분리했던 사칙연산을 하나의 'ENUM' 타입으로 통합하여 관리합니다. 이를 통해 코드가 간결해지고 유지보수가 용이해졌습니다.

* 결과값 비교 기능 : 연산 후 저장된 결과값이 있을 경우, 현재 연산의 결과값보다 큰 값을 출력하는 기능을 추가했습니다. 이 기능은 람다(Lambda)와 스트림(Stream) API를 활용하여 구현되었습니다.

* 제네릭 타입 : 'ArithmeticCalculator' 클래스는 피연산자를 여러 타입으로 받을 수 있도록 제네릭 타입으로 변경되었습니다. 이를 통해 다양한 데이터 타입에 대해 유연하게 계산을 수행할 수 있습니다.

[코드 보기 - cal3](https://github.com/HEEHYUN0221/javapracs/tree/main/cal3)

- - -

### 4. 네번째 계산기(가장 초기 계산기 구현)

* 입력 : 사용자는 하나의 문자열로 연산식을 입력합니다. 예를 들어 '5+3' 같은 형식으로 입력하게 됩니다. 이 때 연산자 분리를 위해 정규식을 사용합니다.

* 연산 수행 : Calculator 클래스는 각 연산을 처리하는 역할을 합니다. 연산자는 문자열로 전달되며, 이를 기반으로 사칙연산을 수행하는 개별 클래스를 호출합니다.

* 사칙연산 클래스 : 각 연산 클래스는 AddOperation, SubstractOperation, MultiplyOperation, DivideOperation 으로 각각의 연산을 담당하는 메소드를 가지고 있습니다.

* 오류 처리 : 잘못된 연산자가 입력되었을 경우 "Invalid operator"라는 메시지를 출력합니다.

[코드 보기 - step3](https://github.com/HEEHYUN0221/javapracs/tree/main/step3)

- - -

### 5. 다섯번째 계산기 (추상 클래스 활용)

* 추상 클래스 활용 : AbstractOperation 이라는 추상 클래스를 정의하고, 각 연산(AddOperation, SubstractOperation, MultiplyOperation, DivideOperation)이 이를 상속받아 구체적인 연산 로직을 구현합니다.

* 코드 확장 : Calculator 클래스는 AbstractOperation 객체를 받아 연산을 수행하며, 사용자는 어떤 연산이든 쉽게 확장할 수 있습니다.

* 코드 간소화 : 이전 버전에서는 각 연산마다 조건문(if-else)으로 처리했으나, 이번 버전에서는 추상 클래스와 다형성을 활용하여 이러한 조건문을 제거했습니다. 각 연산은 해당 연산에 맞는 클래스를 인스턴스화하여 처리되므로 코드가 훨씬 간결해졌습니다.

[코드 보기 - step4](https://github.com/HEEHYUN0221/javapracs/tree/main/step4)

- - -

### 6. 여섯번째 계산기 (입력 처리 분리, 예외 처리 추가)

* 입력 처리 분리 : 메인 클래스에서 입력을 직접 처리하던 부분이 'Calculator'클래스로 분리되었습니다. 이를 통해 메인 클래스는 계산기 실행의 흐름만 담당하고, 입력과 관련된 로직은 별도의 클래스로 위임되어 코드의 응집도가 높아졌습니다.

* 예외 처리 : 잘못된 입력이나 예상치 못한 오류가 발생할 경우, BadInputException을 통해 예외 처리를 수행합니다. 특히 숫자가 아닌 값이 입력되거나, 허용되지 않은 연산자가 입력될 때 적절한 예외 메시지를 출력합니다. InputMismatchException과 같은 표준 예외를 처리하여 사용자에게 명확한 오류 메시지를 제공하고 프로그램이 중단되지 않도록 했습니다.

* 입력값 검증 : Parser 클래스에서 사용자가 입력한 값이 올바른지 정규식을 통해 확인합니다. 사용자가 입력한 값이 올바르면 값들을 Calculator 객체에 설정하고 모든 입력이 완료되면 executeCalculator() 메소드를 통해 계산을 실행합니다. 해당 메소드는 내부적으로 Calculator 객체의 calculate() 메소드를 호출하여 결과값을 반환합니다.

[코드 보기 - step5](https://github.com/HEEHYUN0221/javapracs/tree/main/step5)

</details>

## Kiosk 만들기

<details>
    <summary>자세히</summary>

- - - 

### 1. 첫번째 키오스크

* 햄버거 메뉴 출력

* 사용자 입력 처리(숫자 입력)

* 잘못된 입력에 대한 예외 처리 : 숫자가 아닌 값을 입력했을 때 'InputMismatchException' 처리, 메뉴 번호 범위(0-4)를 벗어난 값을 입력했을 때 메시지 출력

* 0을 입력하면 프로그램 종료

[코드 보기 - kiosk-1](https://github.com/HEEHYUN0221/javapracs/tree/main/questkiosk/s1)

  
```mermaid
classDiagram
    class KioskMain {
        +main(String[] args) void
    }

    class MenuItem {
        -String menuName
        -double menuPrice
        -String menuDescription
        +MenuItem(String menuName, double menuPrice, String menuDescription)
        +toString() String
    }

    KioskMain --> MenuItem : "사용"
mermaid```

- - -

### 2. 두번째 키오스크

* 메뉴 데이터 초기화 : KioskMain 클래스에서 MenuItem 객체를 생성하고 리스트에 추가합니다, 메뉴 리스트는 Kiosk 클래스에 전달 됩니다.

* 키오스크 실행 : Kiosk 클래스는 전달 받은 메뉴 리스트를 출력하고 사용자 입력을 처리합니다.

```mermaid
classDiagram
    class KioskMain {
        +main(String[] args) void
    }

    class Kiosk {
        -List~MenuItem~ menus
        +Kiosk(List~MenuItem~ menus)
        +start() void
    }

    class MenuItem {
        -String menuName
        -double menuPrice
        -String menuDescription
        +MenuItem(String menuName, double menuPrice, String menuDescription)
        +toString() String
    }

    KioskMain --> Kiosk : "사용"
    Kiosk --> MenuItem : "사용"
mermaid```

[코드 보기 - kiosk-2](https://github.com/HEEHYUN0221/javapracs/tree/main/questkiosk/s3)

### 3. 세번째 키오스크

* 카테고리 기능 : 다양한 메뉴 카테고리 관리, 카테고리별로 하위 메뉴를 출력 및 선택 가능

```mermaid
classDiagram
    class Kiosk {
        -List~Menu~ menus
        +Kiosk(Menu menus)
        +addMenu(Menu menus) void
        +start() void
    }

    class Menu {
        -String category
        -List~MenuItem~ menus
        +Menu(String category, List~MenuItem~ menuItem)
        +printMenus() void
        +getCategory() String
        +getMenus() List~MenuItem~
    }

    class MenuItem {
        -String menuName
        -double menuPrice
        -String menuDescription
        +MenuItem(String menuName, double menuPrice, String menuDescription)
        +toString() String
    }

    Kiosk --> Menu : "사용"
    Menu --> MenuItem : "포함"
mermaid```

[코드 보기 -kiosk-3](https://github.com/HEEHYUN0221/javapracs/tree/main/questkiosk/s4)
    

    </details>
