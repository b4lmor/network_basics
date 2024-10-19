# Обнаружение копий себя в локальной сети

## Описание приложения

Разработать приложение, которое обнаруживает копии себя в локальной сети с использованием обмена multicast UDP сообщениями. Приложение должно отслеживать моменты появления и исчезновения других копий себя в локальной сети и выводить список IP адресов "живых" копий.

## Основные функции

1. **Обмен сообщениями**:
    - Использовать multicast UDP для отправки и приема сообщений.
    - Приложение должно периодически отправлять сообщения о своём присутствии и слушать ответы от других экземпляров.

2. **Отслеживание состояния**:
    - Приложение должно отслеживать, когда другие копии подключаются и отключаются.
    - При изменениях выводить обновлённый список IP адресов "живых" копий.

3. **Поддержка IPv4 и IPv6**:
    - Адрес multicast-группы передается параметром в приложение.
    - Автоматический выбор протокола (IPv4 или IPv6) в зависимости от переданного адреса группы.

## Параметры приложения

- **Адрес multicast-группы**:
    - Приложение должно принимать адрес группы в качестве командного параметра.
    - Поддержка как стандартных IPv4, так и IPv6 адресов.

## Пример использования

```bash
./self_discovery_app <multicast-group-address>