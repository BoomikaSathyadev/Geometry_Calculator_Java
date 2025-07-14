import java.util.Scanner;

/* I. Area Calculator*/
public class Video_3 {
    public static void main(String [] args) {
        Scanner area_calc = new Scanner(System.in);

        while (true) { 
            System.out.println("=== Area Calculator ===");
            System.out.println("1. Area of Circle");
            System.out.println("2. Area of Triangle");
            System.out.println("3. Area of Rectangle");
            System.out.println("4. Area of Isosceles Triangle");
            System.out.println("5. Area Of Parallelogram");
            System.out.println("6. Area Of Rhombus");
            System.out.println("7. Area Of Equilateral Triangle");
            System.out.println("Exit (X or x)");

            System.out.print("Enter your choice (1-7 or X to exit): ");
            String choice = area_calc.next().trim();
            System.out.println();

            if (choice.equalsIgnoreCase("x")) {
                System.out.println("Thank you! Exited.");
                break;
            } 

            switch (choice) {
            // 1. Area of Circle = π (3.14) * radius²
                case "1" -> {
                    System.out.println("Formula : 1. Area of Circle = π * radius²");
                    System.out.print("  Enter radius: ");
                    double r = area_calc.nextDouble();
                    double area = Math.PI * r * r;
                    System.out.printf("  -> Answer: Area of Circle = %.2f\n", area);
                    System.out.println();
                }
            // 2. Area of Triangle = 1/2 * base * height
                case "2" -> {
                    System.out.println("Formula : 2. Area of Triangle = 1/2 * base * height");
                    System.out.print("  Enter base: ");
                    double base = area_calc.nextDouble();
                    System.out.print("  Enter height: ");
                    double height = area_calc.nextDouble();
                    double area = 0.5 * base * height;
                    System.out.printf("  -> Answer: Area of Triangle = %.2f\n" , area);
                    System.out.println();
                }
            // 3. Area of Rectangle = length * breadth
                case "3" -> {
                    System.out.println("Formula : 3. Area of Rectangle = length * breadth");
                    System.out.print("  Enter length: ");
                    double length = area_calc.nextDouble();
                    System.out.print("  Enter breadth: ");
                    double breadth = area_calc.nextDouble();
                    double area = length * breadth;
                    System.out.printf("  -> Answer: Area of Rectangle = %.2f\n" , area);
                    System.out.println();
                }
            // 4. Area of Isosceles Triangle = (1/4) * base * √(4a² - b²)     [a = equal side, b = base]
                case "4" -> {
                    System.out.println("Formula : 4. Area of Isosceles Triangle = (1/4) * base * √(4a² - b²)");
                    System.out.print("  Enter base: ");
                    double base = area_calc.nextDouble();
                    System.out.print("  Enter equal side: ");
                    double equal_side = area_calc.nextDouble();
                    double root = 4 * Math.pow(equal_side, 2) - Math.pow(base, 2);
                    if (root < 0) {
                        System.out.println("  Invalid input, negative number not allowed.");
                    } else { 
                        double area = 0.25 * base * Math.sqrt(root);
                        System.out.printf("  -> Answer: Area of Isosceles Triangle = %.2f\n" , area);
                    }
                    System.out.println();
                }
            // 5. Area of Parallelogram = base * height
                case "5" -> {
                    System.out.println("Formula : 5. Area of Parallelogram = base * height");
                    System.out.print("  Enter base: ");
                    double base = area_calc.nextDouble();
                    System.out.print("  Enter height: ");
                    double height = area_calc.nextDouble();
                    double area = base * height;
                    System.out.printf("  -> Answer: Area of Parallelogram = %.2f\n" , area);
                    System.out.println();
                }
            // 6. Area of Rhombus = (1/2) * d₁ * d₂ (OR) Area of Rhombus = base * height
                case "6" -> {
                    System.out.print("Choose the formula: Diagonals(1) or Base & Height(2) -> ");
                    String choose = area_calc.next();
                    switch (choose) {
                        case "1" -> {
                            System.out.println("Formula : 6. Area of Rhombus = (1/2) * d₁ * d₂");
                            System.out.print("  Enter d1: ");
                            double d1 = area_calc.nextDouble();
                            System.out.print("  Enter d2: ");
                            double d2 = area_calc.nextDouble();
                            double area = 0.5 * d1 * d2;
                            System.out.printf("  -> Answer: Area of Rhombus = %.2f\n" , area);
                            System.out.println(); 
                        }
                        case "2" -> {
                            System.out.println("Formula : 6. Area of Rhombus = base * height");
                            System.out.print("  Enter base: ");
                            double base = area_calc.nextDouble();
                            System.out.print("  Enter height: ");
                            double height = area_calc.nextDouble();
                            double area = base * height;
                            System.out.printf("  -> Answer: Area of Rhombus = %.2f\n" , area);
                            System.out.println();
                        }
                        default -> {
                            System.out.println("Invalid input");
                            System.out.println();
                        }
                    }
                }
            // 7. Area of Equilateral Triangle = (√3 / 4) * a²   [a = equal side]
                case "7" -> {
                    System.out.println("Formula : 7. Area of Equilateral Triangle = (√3 / 4) * a²");
                    System.out.print("  Enter equal_side: ");
                    double equal_side = area_calc.nextDouble();
                    double area = (Math.sqrt(3) / 4) * Math.pow(equal_side, 2);
                    System.out.printf("  -> Answer: Area of Equilateral Triangle = %.2f\n", area);
                    System.out.println();
                }
            // Default
                default -> {
                    System.out.println("Invalid input.");
                    System.out.println("");
                }
            }
        }
    }
} 


/* II. PERIMETER CALCULATOR*/
class PerimeterCalculator {
    public static void main(String[] args) { 
        Scanner perimeter_calc = new Scanner(System.in);
        while (true) { 
            System.out.println("=== Perimeter Calculator ===");
            System.out.println("1. Perimeter Of Circle");
            System.out.println("2. Perimeter Of Equilateral Triangle");
            System.out.println("3. Perimeter Of Parallelogram");
            System.out.println("4. Perimeter Of Rectangle");
            System.out.println("5. Perimeter Of Square & Rhombus");
            System.out.println("Exit (X or x)");

            System.out.print("Enter your choice (1-5 or X to exit): ");
            String choice = perimeter_calc.next().trim();
            System.out.println();

            if (choice.equalsIgnoreCase("x")) {
                System.out.println("Thank you! Exited.");
                break;
            }

            switch (choice) {
            // 1. Perimeter of Circle = 2 * π * radius
                case "1" -> {
                    System.out.println("Formula : 1. Perimeter of Circle = 2 * π * r");
                    System.out.print("  Enter radius: ");
                    double radius = perimeter_calc.nextDouble();
                    double perimeter = 2 * Math.PI * radius;
                    System.out.printf("  -> Answer: Perimeter of Circle = %.2f\n", perimeter);
                    System.out.println();
                }
            // 2. Perimeter of Equilateral Triangle = 3 * side
                case "2" -> {
                    System.out.println("Formula : 2. Perimeter of Equilateral Triangle = 3 * side");
                    System.out.print("  Enter side: ");
                    double side = perimeter_calc.nextDouble();
                    double perimeter = 3 * side;
                    System.out.printf("  -> Answer: Perimeter of Equilateral Triangle = %.2f\n", perimeter);
                    System.out.println();
                }
            // 3. Perimeter of Parallelogram = 2 * (base + side)
                case "3" -> {
                    System.out.println("Formula : 3. Perimeter of Parallelogram = 2 * (base + side)");
                    System.out.print("  Enter base: ");
                    double base = perimeter_calc.nextDouble();
                    System.out.print("  Enter side: ");
                    double side = perimeter_calc.nextDouble();
                    double perimeter = 2 * (base + side);
                    System.out.printf("  -> Answer: Perimeter of Parallelogram = %.2f\n", perimeter);
                    System.out.println();
                }
            // 4. Perimeter of Rectangle = 2 * (length + width)
                case "4" -> {
                    System.out.println("Formula : 4. Perimeter of Rectangle = 2 * (length + width)");
                    System.out.print("  Enter length: ");
                    double length = perimeter_calc.nextDouble();
                    System.out.print("  Enter width: ");
                    double width = perimeter_calc.nextDouble();
                    double perimeter = 2 * (length + width);
                    System.out.printf("  -> Answer: Perimeter of Rectangle = %.2f\n", perimeter);
                    System.out.println();
                }
            // 5. Perimeter of Square & Rhombus = 4 * side
                case "5" -> {
                    System.out.println("Formula : 5. Perimeter of Square or Rhombus = 4 * side");
                    System.out.print("  Enter side: ");
                    double side = perimeter_calc.nextDouble();
                    double perimeter = 4 * side;
                    System.out.printf("  -> Answer: Perimeter of Square & Rhombus = %.2f\n", perimeter);
                    System.out.println();
                }
            // Default
                default -> {
                    System.out.println("Invalid input. Please try again.");
                    System.out.println();
                }
            }
        }
    }
}


/* III. Volume Clculator */
class VolumeCalculator {
    public static void main(String[] args) {
        Scanner volume_calc = new Scanner(System.in);
        while (true) { 
            System.out.println("=== Volume Calculator ===");
            System.out.println("1. Volume of Cone");
            System.out.println("2. Volume of Prism");
            System.out.println("3. Volume of Cylinder");
            System.out.println("4. Volume of Sphere");
            System.out.println("5. Volume of Pyramid");
            System.out.println("Exit (X or x)");

            System.out.print("Enter your choice (1-5 or X to exit): ");
            String choice = volume_calc.next().trim();
            System.out.println();

            if (choice.equalsIgnoreCase("x")) {
                System.out.println("Thank you! Exited.");
                break;
            }

            switch (choice) {
            // 1. Volume of Cone = 1/3 * π * radius² * height
                case "1" -> {
                    System.out.println("Formula : 1. Volume of Cone = (1/3) * π * r² * h");
                    System.out.print("  Enter radius: ");
                    double radius = volume_calc.nextDouble();
                    System.out.print("  Enter height: ");
                    double height = volume_calc.nextDouble();
                    double volume = (1.0/3) * Math.PI * Math.pow(radius, 2) * height;
                    System.out.printf("  -> Answer: Volume of Cone = %.2f\n", volume);
                    System.out.println();
                }
            // 2. Volume of Prism = Base Area * Height
                case "2" -> {
                    System.out.println("Formula : 2. Volume of Prism = Base Area * Height");
                    System.out.print("  Enter Base area: ");
                    double base_area = volume_calc.nextDouble();
                    System.out.print("  Enter Height: ");
                    double height = volume_calc.nextDouble();
                    double volume = base_area * height;
                    System.out.printf("  -> Answer: Volume of Prism = %.2f\n", volume);
                    System.out.println();
                }
            // 3. Volume of Cylinder = π * radius² * height
                case "3" -> {
                    System.out.println("Formula : 3. Volume of Cylinder = π * radius² * height");
                    System.out.print("  Enter radius: ");
                    double radius = volume_calc.nextDouble();
                    System.out.print("  Enter height: ");
                    double height = volume_calc.nextDouble();
                    double volume = Math.PI * Math.pow(radius, 2) * height;
                    System.out.printf("  -> Answer: Volume of Cylinder = %.2f\n", volume);
                    System.out.println();
                }
            // 4. Volume of Sphere = (4/3) * π * radius³
                case "4" -> {
                    System.out.println("Formula : 4. Volume of Sphere = (4/3) * π * radius³");
                    System.out.print("  Enter radius: ");
                    double radius = volume_calc.nextDouble();
                    double volume = (4.0/3) * Math.PI * Math.pow(radius, 3);
                    System.out.printf("  -> Answer: Volume of Sphere = %.2f\n", volume);
                    System.out.println();
                }
            // 5. Volume of Pyramid = (1/3) * Base Area * Height
                case "5" -> {
                    System.out.println("Formula : 5. Volume of Pyramid = (1/3) * Base Area * Height");
                    System.out.print("  Enter Base Area: ");
                    double base_area = volume_calc.nextDouble();
                    System.out.print("  Enter Height: ");
                    double height = volume_calc.nextDouble();
                    double volume = (1.0/3) * base_area * height;
                    System.out.printf("  -> Answer: Volume of Pyramid = %.2f\n", volume);
                    System.out.println();
                }
            // Default
                default -> {
                    System.out.println("Invalid input. Please try again.");
                    System.out.println();
                }
            }
        }
    }
}


/* IV. Surface Area */
class SurfaceAreaCalculator {
    public static void main(String[] args) {
        Scanner surface_area_calc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Curved Surface Area Of Cylinder");
            System.out.println("2. Total Surface Area Of Cube");
            System.out.println("Exit (X or x)");

            System.out.print("Enter your choice (1-2 or X to exit): ");
            String choice = surface_area_calc.next().trim();
            System.out.println();

            if (choice.equalsIgnoreCase("x")) {
                System.out.println("Thank you! Exited.");
                break;
            }

            switch (choice) {
            // 1. Curved Surface Area (CSA) Of Cylinder = 2 * π * radius * height
                case "1" -> {
                    System.out.println("Formula : 1. Curved Surface Area(CSA)Of Cylinder = 2 * π * radius * height");
                    System.out.print("  Enter radius: ");
                    double radius = surface_area_calc.nextDouble();
                    System.out.print("  Enter height: ");
                    double height = surface_area_calc.nextDouble();
                    double surface_area = 2 * Math.PI * radius * height;
                    System.out.printf("  -> Answer: Curved Surface Area of Cylinder = %.2f\n", surface_area);
                    System.out.println();
                }
            // 2. Total Surface Area (TSA) of Cube = 6 * a²    [a = length of one side of the cube]
                case "2" -> {
                    System.out.println("Formula : 2. Total Surface Area(TSA) of Cube = 6a²");
                    System.out.print("  Enter length of one side of the cube: ");
                    double a = surface_area_calc.nextDouble();
                    double surface_area = 6 * Math.pow(a, 2);
                    System.out.printf("  -> Answer: Total Surface Area of Cube = %.2f\n", surface_area);
                    System.out.println();
                }
            // Default
                default -> {
                    System.out.println("Invalid input. Please try again.");
                    System.out.println();
                }
            }
        }
    }
}
