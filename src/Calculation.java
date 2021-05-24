public class Calculation {
    public static String ex() {
        System.out.println("Введите выражение с числами от 1 до 10: ");
        String input = Calculator.scan.next();
        int result = 0;
        String[] numbers;
        ////////////////////ROMAN
        if (input.contains("C")||input.contains("L")||input.contains("X")
                ||input.contains("V")||input.contains("I")||input.contains("1")||input.contains("2")
                ||input.contains("3") ||input.contains("4")||input.contains("5")||input.contains("6")
                ||input.contains("7")||input.contains("8")||input.contains("9")||input.contains("10") ) {
            if (input.contains("C") || input.contains("L") || input.contains("X")
                    || input.contains("V") || input.contains("I")) {
                if (input.indexOf('+') > 0) {
                    numbers = input.split("[+]");
                    if (RomanNum.isRoman(numbers[0]) && RomanNum.isRoman(numbers[1])) {
                        result = RomanNum.convert(numbers[0]) + RomanNum.convert(numbers[1]);
                        if (RomanNum.convert(numbers[0]) > 10 | RomanNum.convert(numbers[1]) > 10
                                | RomanNum.convert(numbers[0]) < 0 | RomanNum.convert(numbers[1]) < 0) {
                            try {
                                throw new NumberException();
                            } catch (NumberException e) {
                                System.err.println("Числа должны быть от 1 до 10");
                                return ex();
                            }
                        }
                    } else {
                        try {
                            throw new TypeException();
                        } catch (TypeException e) {
                            System.err.println("Числа разных типов. Введите либо арабские либо римские цифры");
                            return ex();
                        }
                    }
                } else if (input.indexOf('-') > 0) {
                    numbers = input.split("[-]");
                    if (RomanNum.isRoman(numbers[0]) && RomanNum.isRoman(numbers[1])) {
                        result = RomanNum.convert(numbers[0]) - RomanNum.convert(numbers[1]);
                        if (RomanNum.convert(numbers[0]) > 10 | RomanNum.convert(numbers[1]) > 10
                                | RomanNum.convert(numbers[0]) < 0 | RomanNum.convert(numbers[1]) < 0) {
                            try {
                                throw new NumberException();
                            } catch (NumberException e) {
                                System.err.println("Числа должны быть от 1 до 10");
                                return ex();
                            }
                        }
                    } else {
                        try {
                            throw new TypeException();
                        } catch (TypeException e) {
                            System.err.println("Числа разных типов. Введите либо арабские либо римские цифры");
                            return ex();
                        }
                    }
                } else if (input.indexOf('*') > 0) {
                    numbers = input.split("[*]");
                    if (RomanNum.isRoman(numbers[0]) && RomanNum.isRoman(numbers[1])) {
                        result = RomanNum.convert(numbers[0]) * RomanNum.convert(numbers[1]);
                        if (RomanNum.convert(numbers[0]) > 10 | RomanNum.convert(numbers[1]) > 10
                                | RomanNum.convert(numbers[0]) < 0 | RomanNum.convert(numbers[1]) < 0) {
                            try {
                                throw new NumberException();
                            } catch (NumberException e) {
                                System.err.println("Числа должны быть от 1 до 10");
                                return ex();
                            }
                        }
                    } else {
                        try {
                            throw new TypeException();
                        } catch (TypeException e) {
                            System.err.println("Числа разных типов. Введите либо арабские либо римские цифры");
                            return ex();
                        }
                    }
                } else if (input.indexOf('/') > 0) {
                    numbers = input.split("[/]");
                    if (RomanNum.isRoman(numbers[0]) && RomanNum.isRoman(numbers[1])) {
                        result = RomanNum.convert(numbers[0]) / RomanNum.convert(numbers[1]);
                        if (RomanNum.convert(numbers[0]) > 10 | RomanNum.convert(numbers[1]) > 10
                                | RomanNum.convert(numbers[0]) < 0 | RomanNum.convert(numbers[1]) < 0) {
                            try {
                                throw new NumberException();
                            } catch (NumberException e) {
                                System.err.println("Числа должны быть от 1 до 10");
                                return ex();
                            }
                        }
                    } else {
                        try {
                            throw new TypeException();
                        } catch (TypeException e) {
                            System.err.println("Числа разных типов. Введите либо арабские либо римские цифры");
                            return ex();
                        }
                    }
                }
                return RomanNum.convertToArab(result);
            }
            ////////////////////////// ARABIC
            else if (input.indexOf('+') > 0) {
                numbers = input.split("[+]");
                if ((Double.parseDouble(numbers[0]) % 1 == 0) && (Double.parseDouble(numbers[1]) % 1 == 0)) {
                    result = Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
                    if (Integer.parseInt(numbers[0]) > 10 | Integer.parseInt(numbers[1]) > 10
                            | Integer.parseInt(numbers[0]) < 0 | Integer.parseInt(numbers[1]) < 0) {
                        try {
                            throw new NumberException();
                        } catch (NumberException e) {
                            System.err.println("Числа должны быть от 1 до 10");
                            return ex();
                        }
                    }
                } else {
                    try {
                        throw new NumberException();
                    } catch (NumberException e) {
                        System.err.println("Дробные числа. Введите целые числа");
                        return ex();
                    }
                }
            } else if (input.indexOf('-') > 0) {
                numbers = input.split("[-]");
                if ((Double.parseDouble(numbers[0]) % 1 == 0) && (Double.parseDouble(numbers[1]) % 1 == 0)) {
                    result = Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[1]);
                    if (Integer.parseInt(numbers[0]) > 10 | Integer.parseInt(numbers[1]) > 10
                            || Integer.parseInt(numbers[0]) < 0 | Integer.parseInt(numbers[1]) < 0) {
                        try {
                            throw new NumberException();
                        } catch (NumberException e) {
                            System.err.println("Числа должны быть от 1 до 10");
                            return ex();
                        }
                    }
                } else {
                    try {
                        throw new NumberException();
                    } catch (NumberException e) {
                        System.err.println("Дробные числа. Введите целые числа");
                        return ex();
                    }
                }
            } else if (input.indexOf('*') > 0) {
                numbers = input.split("[*]");
                if ((Double.parseDouble(numbers[0]) % 1 == 0) && (Double.parseDouble(numbers[1]) % 1 == 0)) {
                    result = Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[1]);
                    if (Integer.parseInt(numbers[0]) > 10 | Integer.parseInt(numbers[1]) > 10
                            || Integer.parseInt(numbers[0]) < 0 | Integer.parseInt(numbers[1]) < 0) {
                        try {
                            throw new NumberException();
                        } catch (NumberException e) {
                            System.err.println("Числа должны быть от 1 до 10");
                            return ex();
                        }
                    }
                } else {
                    try {
                        throw new NumberException();
                    } catch (NumberException e) {
                        System.err.println("Дробные числа. Введите целые числа");
                        return ex();
                    }
                }
            } else if (input.indexOf('/') > 0) {
                numbers = input.split("[/]");
                if ((Double.parseDouble(numbers[0]) % 1 == 0) && (Double.parseDouble(numbers[1]) % 1 == 0)) {
                    result = Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[1]);
                    if (Integer.parseInt(numbers[0]) > 10 | Integer.parseInt(numbers[1]) > 10
                            || Integer.parseInt(numbers[0]) < 0 | Integer.parseInt(numbers[1]) < 0) {
                        try {
                            throw new NumberException();
                        } catch (NumberException e) {
                            System.err.println("Числа должны быть от 1 до 10");
                            return ex();
                        }
                    }
                } else {
                    try {
                        throw new NumberException();
                    } catch (NumberException e) {
                        System.err.println("Дробные числа. Введите целые числа");
                        return ex();
                    }
                }
            }
        }        else {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("Что-то пошло не так. Введите выражение с числами от 1 до 10: ");
                return ex();
            }
        }

        return String.valueOf(result);
    }
}
