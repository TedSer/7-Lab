package lviv.iot.ua;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HistoricalMovieManagerTest {
    private List<HistoricalMovie> staff = new LinkedList<>();
    HistoricalMovie lamp = new Lamp("DualKEE", 12, "CeenOn", "Spring", 150, 25, BrandType.PIONEER);
    HistoricalMovie camera = new Camera("Lowa", "Spring", 1500, 15, BrandType.LG, "2k-pro", "Superpower");
    HistoricalMovie microphone = new Microphone("Ultra", 7, "Rare_sound", "Spring",
            1200, 5, BrandType.REALTEC);
    HistoricalMovieManager historicalMovieManager = new HistoricalMovieManager();

    @BeforeEach
    public void setUp() {

        historicalMovieManager.addGoods(lamp);
        historicalMovieManager.addGoods(camera);
        historicalMovieManager.addGoods(microphone);


    }

    @Test
    public void sortByPrice() {

        historicalMovieManager.addGoods(lamp);
        historicalMovieManager.addGoods(camera);
        historicalMovieManager.addGoods(microphone);

       List<HistoricalMovie> sortedByPrice = historicalMovieManager.sortByPrice();

        assertEquals(historicalMovieManager.getGoods().get(1),sortedByPrice.get(1));

    }

    @Test
    public void findByGroup() throws IOException {
        FileWriter writer = new FileWriter();
        writer.writeCSV(historicalMovieManager.getGoods());

    }
}

