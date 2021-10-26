import car.Car;
import car.CarCreator;
import car.CarService;
import client.Client;
import client.ClientRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import payment.PaymentRepository;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class CarServiceTest {
    @Mock
    CarCreator carCreator;

    @Mock
    ClientRepository clientRepository;

    @Mock
    PaymentRepository paymentRepository;

    @Test
    public void registerClientCarShouldAddCarToClientAndReturnClient(){

        Car testCar = new Car();
        testCar.setColor("black");
        testCar.setMake("mercedes");
        testCar.setPlate("GWE 212");

        Client testClient = new Client("12", true, null);
        when(clientRepository.findClient("12")).thenReturn(testClient);
        when(carCreator.createCar("mercedes", "black", "GWE 212")).thenReturn(testCar);

        CarService carService = new CarService(carCreator, clientRepository, paymentRepository);
        carService.registerClientCar("12", "mercedes", "black", "GWE 212");

        Client client = carService.registerClientCar("12", "mercedes", "black", "GWE 212");



        Assert.assertEquals("12", client.getId());
        Assert.assertNotNull(client.getCar().getColor());
        Assert.assertEquals("mercedes",client.getCar().getMake());
        Assert.assertEquals("black", client.getCar().getColor());
        Assert.assertEquals("GWE 212", client.getCar().getPlate());

    }
}
