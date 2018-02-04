#language: ru

Функционал: Яндекс маркет

  Сценарий: 1.Телевизоры

    Когда выбран пункт меню "Маркет"
    Когда выбрана вид товара "Электроника"
    Тогда выбрана категория товаров "Телевизоры"
    Тогда выполнено нажатие на Перейти ко всем фильтрам

    Когда заполняются поля:
      |Цена от|20000|
    
    Когда выбран производитель "Samsung"
    Когда выбран производитель "LG"
    Тогда выполнено нажатие на Показать подходящие
    
    Когда количество товара на странице 12
    Когда сохранено название первого товара в списке
    Когда введено значение сохраненного элемента в сторку поиска
    Тогда нажата кнопка Найти
    Тогда найденный элемент соответствует поиску