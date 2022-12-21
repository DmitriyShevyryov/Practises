package lab2;


import java.util.Scanner;

public class DogHouse {
    private Dog[] dogs = new Dog[1];
    int num = 1;

    public Dog[] getDogs() {
        return dogs;
    }

    public Dog[] addDogs(Dog obj)
    {
        if(num == 1){
            dogs[0] = obj;
            num++;
            return dogs;
        }
        else {
            Dog[] new_array = new Dog[dogs.length + 1];
            for (int i = 0; i < dogs.length; i++)
            {
                new_array[i] = dogs[i];

            }
            new_array[new_array.length-1] = obj;
            num++;
            return new_array;
        }

    }
    public void show(){
        for(int i=0; i<num-1; i++)
        {
            System.out.println(dogs[i].toString());
        }
    }

    public static void main(String[] args) {
        int k = 0;
        do {
            DogHouse home = new DogHouse();
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите 1, если хотите отдать собаку в приют, 0 - если хотите увидеть всех собак");
            int a = sc.nextInt();
            if(a == 1)
            {
                String name = sc.next();
                int age = sc.nextInt();
                Dog dog = new Dog(name,age);
                home.dogs = home.addDogs(dog);
             }
            if(a==0)
            {
                home.show();
            }
            k++;
        }
        while(k>0);

    }
}
