package app2;

public class Main {
	public static void main(String[] args) {
		/*
		Computer comp1 = new Server();
		Computer comp2 = new Computer();
		Computer comp3 = new Computer();
		Device comp4 = new Notebook();
		
		Server serv = new Server();
		Server serv1 = new Server();
		serv.setKolProc(20);
		serv1.setKolProc(4);
		System.out.println(Device.getCount());
		//System.out.println(serv1.getCount());
		
		//Перевод в Мб И Гб
		Computer comp6 = new Computer();
		comp6.setRam(2000000000);
		System.out.println("Переводим в Мб " +comp6.perevodMb());
		System.out.println("Переводим в Гб " +comp6.perevodGb());
		
		//Device dev = new Device();
		//dev = dev.createDevice(2,110);
		//dev = dev.createDevice(3,220);
		comp1.setRam(550);
		comp2.setRam(30);		
		comp3.setPower(5);
		comp4.setPower(3);
		
		//Создайте несколько объектов этих классов и выведите информацию  о них на экран.
		
		//Предусмотрите возможность создания устройств без указания мощности и возможность изменения мощности 
		//уже созданным устройствам позднее. Создайте ноутбук без указания мощности и назначьте этому ноутбуку мощность.
		
		//Создайте метод, устанавливающий мощность устройству. Метод должен возвращать само устройство. 
		//Переопределите этот метод для компьютеров. 
		//Создайте такой же метод, устанавливающий объём памяти для компьютеров. 
		//Используйте эти методы на практике.
		
		System.out.println("Память сервера " +comp1.getRam());
		System.out.println("Память компьютера " +comp2.getRam());
		System.out.println("Мощность компьютера " +comp3.getPower());
		System.out.println("Мощность ноутбука " +comp4.getPower());
		
		//вывод метода количества процессоров
		Device obj = new Device();
		Device dev = obj.createDevice(3,220);
		System.out.println(dev.getPower());
		System.out.println(dev.getClass() +" "+ dev.getName() +" "+dev.getPower() );
		
		//Создайте метод назначения уникальных идентификаторов для каждого устройства
		//(подразумевается сквозная нумерация всех устройств). Для каждого запуска программы 
		//нумерация должна начинаться со случайного числа. Обеспечьте невозможность переопределения метода 
		//назначения уникальных идентфикаторов.

		//Обеспечьте отсутствие возможности наследования классу плазменных телевизоров

		//Создайте ограничения на объём памяти для компьютеров. 
		//Память должна быть не менее минимального значения и не более максимального значения. 
		//При попытке создать компьютер(или изменить существующий) с неправильной памятью – выдавать предупреждение 
		//и не вносить данные о такой памяти. Ограничения должны быть известны создателю нового компьютера до его создания
		*/
		/*
		Computer comp7 = new Server();
		comp7.setRam(Computer.ram);
		System.out.println("Память сервера " +comp7.getRam()+" ID: "+comp7.createId());
		
		Device comp9 = new Tv();
		System.out.println(comp9 +" ID: "+comp9.createId());
		Device comp10 = new Tv();
		System.out.println(comp10 +" ID: "+comp10.createId());
		Device comp11 = new Tv();
		System.out.println(comp11 +" ID: "+comp11.createId());
		Device comp12 = new Tv();
		System.out.println(comp11 +" ID: "+comp12.createId());
		*/
		/*
		 // Сумма Power
		int n = 5;
		Device dev[] = new Device[n];
		Device devobj = new Device();
		dev[0] = devobj.createDevice(1,5);
		dev[1] = devobj.createDevice(2,6);
		dev[2] = devobj.createDevice(1,7);
		dev[3] = devobj.createDevice(2,8);
		dev[4] = devobj.createDevice(3,9);
		System.out.println("Сумарная мощность: "+devobj.sumPow(dev)); //сумарная мощность элементов массива
		*/
		//Сумма RAM
		/*
		int n = 3;
		Device devobj = new Device();
		Device dev[] = new Device[n];
		dev[0] = devobj.createDevice(3,5);// явное преобразование
		((Computer)dev[0]).setRam(10);
		dev[1] = devobj.createDevice(2,6);
		dev[2] = devobj.createDevice(1,7);
		((Computer)dev[2]).setRam(20);	// явное преобразование
		System.out.println(devobj.getCounter(dev));
		*/
		//Сравнение двух устройств
		// 1-е устройство
		/*
		Device devobj = new Device();
		Device dev = new Device();
		dev = devobj.createDevice(1,5);
		((Computer)dev).setRam(564);
		// 2-е устройство
		Device dev1 = new Device();
		dev1 = devobj.createDevice(3,15);
		((Computer)dev1).setRam(256);
		System.out.println("Результат сравнения: " +devobj.compDevs(dev, dev1));
		*/
		Device devobj = new Device();
		Device dev = new Device();
		dev = devobj.createDevice(1,5);
		// 2-е устройство
		Device dev1 = new Device();
		dev1 = devobj.createDevice(4,15);
		System.out.println("Результат сравнения: " +devobj.compDevs(dev, dev1));
		/*
		Device devobj = new Device();
		Device dev = new Tv();
		dev = devobj.createDevice(4,5);
		((Tv)dev).setDiagonal(60);
		// 2-е устройство
		Device dev1 = new Tv();
		dev1 = devobj.createDevice(4,15);
		((Tv)dev1).setDiagonal(32);
		System.out.println("Результат сравнения: " +devobj.compDevs(dev, dev1));
		*/
	}
}
