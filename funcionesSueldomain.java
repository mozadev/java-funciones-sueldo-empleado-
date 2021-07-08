using System;
using System.Collections;
using System.Collections.Generic;

namespace ensenanza
{
    class Program
    {

        static void Main(string[] args)
        {
            String tipoEmpleado;
            // double descuento;
            double sueldoNet;
            Console.WriteLine("ingrese el tipo de empleado: ");
            tipoEmpleado = Console.ReadLine();
            tipoEmpleado = tipoEmpleado.ToLower();
            sueldoNeto2(tipoEmpleado);
            sueldoNet = sueldoNeto(tipoEmpleado);
            
        }

        static void sueldoNeto2(string tipoEmpleado)
        {
            double sueldoBruto = 0;
            double sueldoNeto = 0;
            if (tipoEmpleado == "g")
            {
                sueldoBruto = 150;
            }
            if (tipoEmpleado == "a")
            {
                sueldoBruto = 80;
            }
            if (tipoEmpleado == "o")
            {
                sueldoBruto = 30;
            }

            sueldoNeto = sueldoBruto - 0.14 * (sueldoBruto);
            Console.WriteLine("el sueldo neto es: " + sueldoNeto);
        }

        static double sueldoNeto(string tipoEmpleado)
        {
            double sueldoBruto = 0;
            double sueldoNeto = 0;
            if (tipoEmpleado == "g")
            {
                sueldoBruto = 150;
            }
            if (tipoEmpleado == "a")
            {
                sueldoBruto = 80;
            }
            if (tipoEmpleado == "o")
            {
                sueldoBruto = 30;
            }

            sueldoNeto = sueldoBruto - 0.14 * (sueldoBruto);

            return sueldoNeto;
        }


    }
}