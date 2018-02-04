package steps;

import pages.TvFilterPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class TvFilterSteps {

    @Step("Количество товаров на странице 12")
    public void checkCountGoods(){
        new TvFilterPage().checkCountGoods();
    }

    @Step("Сохранено название первого товара в списке")
    public void saveFirstElement(){
        new TvFilterPage().saveFirstElement();
    }

    @Step("Ввод в строку поиска значения сохраненного элемента")
    public void searchFirstElement(){
        new TvFilterPage().searchFirstElement();
    }

    @Step("Нажата кнопка Найти")
    public void buttonSearch () {
        new TvFilterPage().buttonSearch.click();
    }
//    @Step("Проверка найденного элемента запросу")
//    public void checkSearch(){
//        String actualTitle = new TvFilterPage().titleGoods.getText();
//        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
//                actualTitle, new TvFilterPage().saveFirstElement()), actualTitle.contains(new TvFilterPage().saveFirstElement()));
//    }

}
