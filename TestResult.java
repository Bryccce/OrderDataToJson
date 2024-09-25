package OrderDataToJson.ResultUtils;

import OrderDataToJson.Order;
import OrderDataToJson.OrderStatusEnum;
import org.junit.Test;

public class TestResult {
    @Test
    public void test01(){
        System.out.println(ResultUtils.result(OrderStatusEnum.NEW, new Order("1123", "Laptop", 10)));
    }
}
