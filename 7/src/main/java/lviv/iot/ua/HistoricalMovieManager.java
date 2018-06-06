package lviv.iot.ua;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class HistoricalMovieManager extends HistoricalMovie {

    private LinkedList<HistoricalMovie> goods = new LinkedList<>();

    public List<HistoricalMovie> sortByPrice() {
        this.goods.sort(Comparator.comparingInt(HistoricalMovie::getCost));
        return this.goods;
    }


    public List<HistoricalMovie> findByGroup(final BrandType goodsType) {
        List<HistoricalMovie> result = new LinkedList<>();
        goods.stream().filter((staff) ->
                ((staff.getBrandType() == goodsType
                ))).forEachOrdered(foundStaff -> {
            result.add(foundStaff);
        });
        return result;
    }

    public void addGoods(final HistoricalMovie goods) {
        this.goods.add(goods);
    }

    public LinkedList<HistoricalMovie> getGoods() {
        return goods;
    }

    public void setGoods(LinkedList<HistoricalMovie> goods) {
        this.goods = goods;
    }
}
