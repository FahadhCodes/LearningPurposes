using System;
namespace Program
{
    class Book
    {
        public int BookId { get; set; }
        public string BookName { get; set; }
        public float rating { get; set; }
        public float price { get; set; }
        public Book(int BookId, string BookName, float rating, float price)
        {
            this.BookId = BookId;
            this.BookName = BookName;
            this.rating = rating;
            this.price = price;
        }
    }

    class main
    {
        static void Main(string[] args)
        {
            Console.Write("Enter the number of data that you want to Add: ");
            int x = int.Parse(Console.ReadLine());
            Book[] obj = new Book[x];

            for (int i = 0; i < x; i++)
            {
                obj[i] = new Book(0, null, 0, 0);
                obj[i].BookId = i;
                Console.Write("Enter Book Name: ");
                obj[i].BookName = Console.ReadLine();
                Console.Write("Enter rating: ");
                obj[i].rating = float.Parse(Console.ReadLine());
                Console.Write("Enter Price: ");
                obj[i].price = float.Parse(Console.ReadLine());
            }

            for (int i = 0; i < x; i++)
            {
                Console.Write($"\nBook ID: {obj[i].BookId}\nBook Name: {obj[i].BookName}\nBook Rating: {obj[i].rating}\nBook price: {obj[i].price}");
            }
        }
    }
}