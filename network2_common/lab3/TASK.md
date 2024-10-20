# Места (Асинхронное сетевое взаимодействие)

## Описание задачи

Разработайте приложение, используя методы асинхронного программирования (например, `CompletableFuture` для Java) или библиотеки реактивного программирования (например, RxJava), чтобы взаимодействовать с несколькими публичными API. Приложение должно иметь интерфейс и работать с API, соблюдая следующие требования:

- **Асинхронные вызовы**:
  - Все вызовы должны выполняться с использованием HTTP-библиотеки с асинхронным интерфейсом.
  - Все независимые друг от друга вызовы API должны выполняться одновременно.
  - Вызовы API, зависящие от данных, полученных из предыдущих API, должны быть оформлены в виде асинхронной цепочки вызовов.

- **Сбор результатов**:
  - Все результаты работы должны объединяться в общий объект без промежуточного вывода.
  - Блокировки на ожидание промежуточных результатов в цепочке вызовов недопустимы, допускается только блокировка на ожидание конечного результата (в случае консольного приложения).

## Логика программы

1. Пользователь вводит название локации (например, "Цветной проезд") и нажимает кнопку поиска.
2. Ищутся варианты локаций с помощью метода [1] и показываются пользователю в виде списка.
3. Пользователь выбирает одну локацию.
4. С помощью метода [2] ищется погода в выбранной локации.
5. С помощью метода [3] ищутся интересные места в локации.
6. Для каждого найденного места с помощью метода [4] ищутся описания.
7. Все найденные данные показываются пользователю.

## Методы API

1. **Получение локаций** (с координатами и названиями):
  - Запрос к API для поиска локаций по названию: https://docs.graphhopper.com/#operation/getGeocode

2. **Получение погоды** (по координатам):
  - Запрос к API, возвращающий информацию о погоде для указанных координат: https://openweathermap.org/current

3. **Получение списка интересных мест** (по координатам):
  - Запрос к API для получения списка интересных мест в данной локации: https://dev.opentripmap.org/docs#/Objects%20list/getListOfPlacesByRadius

4. **Получение описания места** (по его ID):
  - Запрос к API для получения детального описания места по его идентификатору: https://dev.opentripmap.org/docs#/Object%20properties/getPlaceByXid
