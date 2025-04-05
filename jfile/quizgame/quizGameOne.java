import java.io.*;

class quizGameOne {
    public static void main(String[] args)
            throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        int b, wrong = 0;
        int aNine, aTen;
        System.out.println(
                "                                                 ***********Hi...This is Quiz game***********");
        System.out.println("There are three levels.");
        System.out.println("Level 1 has 5 Question.");
        System.out.println("Level 2 has 3 Question.");
        System.out.println("Level 3 has 2 Question.");
        System.out.println("Get ready for quiz.");
        System.out.println("Enter 5 to start quiz.");
        b = Integer.parseInt(br.readLine());
        if (b == 5) {
            int aOne, aTwo, aThree, aFour, aFive;
            System.out.println("                                                       +++++WELCOME+++++");
            System.out.println("                                                             LEVEL 1.");
            System.out.println("Q1.2+2 is");
            aOne = Integer.parseInt(br.readLine());
            System.out.println("Q2.Squre of 12 is ");
            aTwo = Integer.parseInt(br.readLine());
            System.out.println("Q3.Squre root of 64");
            aThree = Integer.parseInt(br.readLine());
            System.out.println("Q4.Multiplication of 2 and 6 is ");
            aFour = Integer.parseInt(br.readLine());
            System.out.println("Cube root of 729.");
            aFive = Integer.parseInt(br.readLine());
            if (aOne == 4 && aTwo == 144 && aThree == 8 && aFour == 12 && aFive == 9) {
                int aSix, aSeven, aEight;
                System.out.println("                                                      LEVEL 2.");
                System.out.println("                                   Now You will Get 3 Chance If answer is Wrong.");
                System.out.println("Q1.What is the Next prime number after 7 is");
                aSix = Integer.parseInt(br.readLine());
                if (aSix == 11) {//
                    System.out.println("Q2.How many Months make century");
                    aSeven = Integer.parseInt(br.readLine());
                    if (aSeven == 1200) {
                        System.out.println("Q3.121 divided by 11");
                        aEight = Integer.parseInt(br.readLine());
                        if (aEight == 11) {
                            // Level 3 Entered...
                            System.out.println("                                         Level 3");

                            System.out.println("Q1.60 Times of 8.");
                            aNine = Integer.parseInt(br.readLine());
                            if (aNine == 480) {
                                System.out.println("Q2.How manay years in a Decade.");
                                aTen = Integer.parseInt(br.readLine());
                                if (aTen == 10) {
                                    // you win
                                    System.out.println("You Win the Quiz.");
                                }
                                if (aTen != 10) {
                                    System.out.println("You Give Wrong Answer");
                                    System.out.println("Q2.How manay years in a Decade.");
                                    aTen = Integer.parseInt(br.readLine());
                                    if (aTen == 10) {
                                        System.out.println("You Win the Quiz.");
                                    }
                                    if (aTen != 10) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10)
                                            System.out.println("You win The Quiz.");
                                        else
                                            System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                    }
                                }
                            }
                            if (aNine != 480) {
                                System.out.println("You Give Wrong Answer");
                                System.out.println("Q1.60 Times of 8.");
                                aNine = Integer.parseInt(br.readLine());
                                if (aNine == 480) {
                                    System.out.println("You Give Wrong Answer");
                                    System.out.println("Q2.How manay years in a Decade.");
                                    aTen = Integer.parseInt(br.readLine());
                                    if (aTen == 10) {
                                        System.out.println("You win The Quiz.");
                                    } else
                                        System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                }
                                if (aNine != 480) {
                                    System.out.println("You Give Wrong Answer");
                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10)
                                            System.out.println("You Win the Quiz.");
                                        else
                                            System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                    }
                                }
                            }

                        }

                        if (aEight != 11) {
                            wrong = wrong + 1;
                            System.out.println("You Give Wrong Answer.");
                            System.out.println("Q3.121 divided by 11");
                            aEight = Integer.parseInt(br.readLine());
                            if (aEight == 11) {
                                // Level 3 Entered...
                                System.out.println("                                         Level 3");

                                System.out.println("Q1.60 Times of 8.");
                                aNine = Integer.parseInt(br.readLine());
                                if (aNine == 480) {
                                    System.out.println("Q2.How manay years in a Decade.");
                                    aTen = Integer.parseInt(br.readLine());
                                    if (aTen == 10) {
                                        // you win
                                        System.out.println("You Win the Quiz.");
                                    }
                                    if (aTen != 10) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You win The Quiz.");
                                            else
                                                System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                        }
                                    }
                                }
                                if (aNine != 480) {
                                    System.out.println("You Give Wrong Answer");
                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            System.out.println("You win The Quiz.");
                                        } else
                                            System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You Win the Quiz.");
                                            }
                                        } else
                                            System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                    }
                                }

                            }
                        }
                    }
                    if (aSeven != 1200) {
                        wrong = wrong + 1;
                        System.out.println("You Give Wrong Answer.");
                        System.out.println("Q2.How many Months make century");
                        aSeven = Integer.parseInt(br.readLine());
                        if (aSeven == 1200) {
                            System.out.println("Q3.121 divided by 11");
                            aEight = Integer.parseInt(br.readLine());
                            if (aEight == 11) {
                                // Level 3 Entered...
                                System.out.println("                                         Level 3");

                                System.out.println("Q1.60 Times of 8.");
                                aNine = Integer.parseInt(br.readLine());
                                if (aNine == 480) {
                                    System.out.println("Q2.How manay years in a Decade.");
                                    aTen = Integer.parseInt(br.readLine());
                                    if (aTen == 10) {
                                        // you win
                                        System.out.println("You Win the Quiz.");
                                    }
                                    if (aTen != 10) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You win The Quiz.");
                                            else
                                                System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                        }
                                    }
                                }
                                if (aNine != 480) {
                                    System.out.println("You Give Wrong Answer");
                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            System.out.println("You win The Quiz.");
                                        } else
                                            System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You Win the Quiz.");
                                            }
                                        } else
                                            System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                    }
                                }
                            }
                            if (aEight != 11) {
                                wrong = wrong + 1;
                                System.out.println("You Give Wrong Answer.");
                                System.out.println("Q3.121 divided by 11");
                                aEight = Integer.parseInt(br.readLine());
                                if (aEight == 11) {
                                    // Level 3 Entered...
                                    System.out.println("                                         Level 3");

                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            // you win
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You win The Quiz.");
                                                else
                                                    System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                            }
                                        }
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You win The Quiz.");
                                            } else
                                                System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You Win the Quiz.");
                                                else
                                                    System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                            }
                                        }
                                    }
                                } else
                                    System.out.println("Get Lost!!");

                            }
                        }
                        if (aSeven != 1200) {
                            wrong = wrong + 1;
                            System.out.println("You Give Wrong Answer.");
                            System.out.println("Q2.How many Months make century");
                            aSeven = Integer.parseInt(br.readLine());
                            if (aSeven == 1200) {
                                System.out.println("Q3.121 divided by 11");
                                aEight = Integer.parseInt(br.readLine());
                                if (aEight == 11) {
                                    // level 3 Entered
                                    System.out.println("                               LEVEL 3.");
                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            // you win
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You win The Quiz.");
                                                else
                                                    System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                            }
                                        }
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You win The Quiz.");
                                            else
                                                System.out.println("Get Lost!!\nYou Give Wrong Answer");//

                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You Win the Quiz.");
                                                else
                                                    System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                            }
                                        }
                                    }
                                }
                                if (aEight != 11) {
                                    wrong = wrong + 1;
                                    System.out.println("You Give Wrong Answer.");
                                    System.out.println("Q3.121 divided by 11");
                                    aEight = Integer.parseInt(br.readLine());
                                    if (aEight == 11) {
                                        // level 3 Entered...
                                        System.out.println("                                         Level 3");

                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                // you win
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10) {
                                                    System.out.println("You Win the Quiz.");
                                                }
                                                if (aTen != 10) {
                                                    System.out.println("You Give Wrong Answer");
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10)
                                                        System.out.println("You win The Quiz.");
                                                    else
                                                        System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                                }
                                            }
                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10) {
                                                    System.out.println("You win The Quiz.");
                                                }
                                            }
                                            if (aNine != 480) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q1.60 Times of 8.");
                                                aNine = Integer.parseInt(br.readLine());
                                                if (aNine == 480) {
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10)
                                                        System.out.println("You Win the Quiz.");
                                                    else
                                                        System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                                }
                                            }
                                        }

                                    } else
                                        System.out.println("Get Lost!!");
                                }
                            } else
                                System.out.println("Get lost!!");
                        }
                    }

                }
                if (aSix != 11) {
                    wrong = wrong + 1;
                    System.out.println("You Give Wrong Answer");
                    System.out.println("Q1.What is the Next prime number after 7 is");
                    aSix = Integer.parseInt(br.readLine());
                    if (aSix == 11) {
                        System.out.println("Q2.How many Months make century");
                        aSeven = Integer.parseInt(br.readLine());
                        if (aSeven == 1200) {
                            System.out.println("Q3.121 divided by 11");
                            aEight = Integer.parseInt(br.readLine());
                            if (aEight == 11) {
                                // Level 3 Entered...
                                System.out.println("                                         Level 3");

                                System.out.println("Q1.60 Times of 8.");
                                aNine = Integer.parseInt(br.readLine());
                                if (aNine == 480) {
                                    System.out.println("Q2.How manay years in a Decade.");
                                    aTen = Integer.parseInt(br.readLine());
                                    if (aTen == 10) {
                                        // you win
                                        System.out.println("You Win the Quiz.");
                                    }
                                    if (aTen != 10) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You win The Quiz.");
                                            else
                                                System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                        }
                                    }
                                }
                                if (aNine != 480) {
                                    System.out.println("You Give Wrong Answer");
                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10)
                                            System.out.println("You win The Quiz.");
                                        else
                                            System.out.println("Get lost!!\nYou Give Wrong Answer.");
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You Win the Quiz.");
                                            else
                                                System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                        }
                                    }
                                }

                            }
                            if (aEight != 11) {
                                wrong = wrong + 1;
                                System.out.println("You Give Wrong Answer.");
                                System.out.println("Q3.121 divided by 11");
                                aEight = Integer.parseInt(br.readLine());
                                if (aEight == 11) {
                                    // level 3 Entered...
                                    System.out.println("                                         Level 3");

                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            // you win
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You win The Quiz.");
                                                else
                                                    System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                            }
                                        }
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You win The Quiz.");
                                            else
                                                System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You Win the Quiz.");
                                                else
                                                    System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                            }
                                        }
                                    }

                                } else
                                    System.out.println("Get lost.");
                            }

                        }
                        if (aSeven != 1200) {
                            wrong = wrong + 1;
                            System.out.println("You Give Wrong Answer.");
                            System.out.println("Q2.How many Months make century");
                            aSeven = Integer.parseInt(br.readLine());
                            if (aSeven == 1200) {
                                System.out.println("Q3.121 divided by 11");
                                aEight = Integer.parseInt(br.readLine());
                                if (aEight == 11) {
                                    // Level 3 Entered...
                                    System.out.println("                                         Level 3");

                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            // you win
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You win The Quiz.");
                                                else
                                                    System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                            }
                                        }
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You win The Quiz.");
                                            else
                                                System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You Win the Quiz.");
                                                else
                                                    System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                            }
                                        }
                                    }

                                }
                                if (aEight != 11) {
                                    wrong = wrong + 1;
                                    System.out.println("You Give Wrong Answer.");
                                    System.out.println("Q3.121 divided by 11");
                                    aEight = Integer.parseInt(br.readLine());
                                    if (aEight == 11) {
                                        // Level 3 Entered...
                                        System.out.println("                                         Level 3");

                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                // you win
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10) {
                                                    System.out.println("You Win the Quiz.");
                                                }
                                                if (aTen != 10) {
                                                    System.out.println("You Give Wrong Answer");
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10)
                                                        System.out.println("You win The Quiz.");
                                                    else
                                                        System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                                }
                                            }
                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You win The Quiz.");
                                                else
                                                    System.out.println("Get Lost!! \n You Give Wrong Answer.");

                                            }
                                            if (aNine != 480) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q1.60 Times of 8.");
                                                aNine = Integer.parseInt(br.readLine());
                                                if (aNine == 480) {
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10)
                                                        System.out.println("You Win the Quiz.");
                                                    else
                                                        System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                                }
                                            }
                                        }

                                    } else
                                        System.out.println("Get Lost!!");

                                }
                            }
                            if (aSeven != 1200) {
                                wrong = wrong + 1;
                                System.out.println("You Give Wrong Answer.");
                                System.out.println("Q2.How many Months make century");
                                if (aSeven == 10) {
                                    System.out.println("Q3.121 divided by 11");
                                    aEight = Integer.parseInt(br.readLine());
                                    if (aEight == 11) {
                                        // level 3 Entered...
                                        System.out.println("                                         Level 3");

                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                // you win
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10) {
                                                    System.out.println("You Win the Quiz.");
                                                }
                                                if (aTen != 10) {
                                                    System.out.println("You Give Wrong Answer");
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10)
                                                        System.out.println("You win The Quiz.");
                                                    else
                                                        System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                                }
                                            }
                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You win The Quiz.");
                                                else
                                                    System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                            }
                                            if (aNine != 480) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q1.60 Times of 8.");
                                                aNine = Integer.parseInt(br.readLine());
                                                if (aNine == 480) {
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10)
                                                        System.out.println("You Win the Quiz.");
                                                    else
                                                        System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                                }
                                            }
                                        }

                                    }
                                    if (aEight != 11) {
                                        wrong = wrong + 1;
                                        System.out.println("You Give Wrong Answer.");
                                        System.out.println("Q3.121 divided by 11");
                                        aEight = Integer.parseInt(br.readLine());
                                        if (aEight == 11) {
                                            // level 3 Entered...
                                            System.out.println("                                         Level 3");

                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10) {
                                                    // you win
                                                    System.out.println("You Win the Quiz.");
                                                }
                                                if (aTen != 10) {
                                                    System.out.println("You Give Wrong Answer");
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10) {
                                                        System.out.println("You Win the Quiz.");
                                                    }
                                                    if (aTen != 10) {
                                                        System.out.println("You Give Wrong Answer");
                                                        System.out.println("Q2.How manay years in a Decade.");
                                                        aTen = Integer.parseInt(br.readLine());
                                                        if (aTen == 10)
                                                            System.out.println("You win The Quiz.");
                                                        else
                                                            System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                                    }
                                                }
                                            }
                                            if (aNine != 480) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q1.60 Times of 8.");
                                                aNine = Integer.parseInt(br.readLine());
                                                if (aNine == 480) {
                                                    System.out.println("You Give Wrong Answer");
                                                    System.out.println("Q2.How manay years in a Decade.");
                                                    aTen = Integer.parseInt(br.readLine());
                                                    if (aTen == 10) {
                                                        System.out.println("You win The Quiz.");
                                                    }
                                                }
                                                if (aNine != 480) {
                                                    System.out.println("You Give Wrong Answer");
                                                    System.out.println("Q1.60 Times of 8.");
                                                    aNine = Integer.parseInt(br.readLine());
                                                    if (aNine == 480) {
                                                        System.out.println("Q2.How manay years in a Decade.");
                                                        aTen = Integer.parseInt(br.readLine());
                                                        if (aTen == 10)
                                                            System.out.println("You Win the Quiz.");
                                                        else
                                                            System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                                    }
                                                }
                                            }

                                        } else
                                            System.out.println("Get Lost!!");
                                    }
                                } else
                                    System.out.println("Get lost!!");
                            }
                        }

                    }
                    //
                    if (aSix != 11) {
                        wrong = wrong + 1;
                        System.out.println("You Give Wrong Answer");
                        System.out.println("Q1.What is the Next prime number after 7 is");
                        aSix = Integer.parseInt(br.readLine());
                        if (aSix == 11) {
                            System.out.println("Q2.How many Months make century");
                            aSeven = Integer.parseInt(br.readLine());
                            if (aSeven == 1200) {
                                System.out.println("Q3.121 divided by 11");
                                aEight = Integer.parseInt(br.readLine());
                                if (aEight == 11) {
                                    // Level 3 Entered...
                                    System.out.println("                                         Level 3");

                                    System.out.println("Q1.60 Times of 8.");
                                    aNine = Integer.parseInt(br.readLine());
                                    if (aNine == 480) {
                                        System.out.println("Q2.How manay years in a Decade.");
                                        aTen = Integer.parseInt(br.readLine());
                                        if (aTen == 10) {
                                            // you win
                                            System.out.println("You Win the Quiz.");
                                        }
                                        if (aTen != 10) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10) {
                                                System.out.println("You Win the Quiz.");
                                            }
                                            if (aTen != 10) {
                                                System.out.println("You Give Wrong Answer");
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You win The Quiz.");
                                                else
                                                    System.out.println("Get Lost!!\n You Give Wrong Answer.");
                                            }
                                        }
                                    }
                                    if (aNine != 480) {
                                        System.out.println("You Give Wrong Answer");
                                        System.out.println("Q1.60 Times of 8.");
                                        aNine = Integer.parseInt(br.readLine());
                                        if (aNine == 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q2.How manay years in a Decade.");
                                            aTen = Integer.parseInt(br.readLine());
                                            if (aTen == 10)
                                                System.out.println("You win The Quiz.");
                                            else
                                                System.out.println("Get Lost!! \n You Give Wrong Answer.");
                                        }
                                        if (aNine != 480) {
                                            System.out.println("You Give Wrong Answer");
                                            System.out.println("Q1.60 Times of 8.");
                                            aNine = Integer.parseInt(br.readLine());
                                            if (aNine == 480) {
                                                System.out.println("Q2.How manay years in a Decade.");
                                                aTen = Integer.parseInt(br.readLine());
                                                if (aTen == 10)
                                                    System.out.println("You Win the Quiz.");
                                                else
                                                    System.out.println("Get Lost!!/nYou Give Wrong Answer.");
                                            }
                                        }
                                    }

                                } else
                                    System.out.println("Sorry we can't Proceed the game.");
                            } else
                                System.out.println("Get Lost!!");
                        } else
                            System.out.println("Sorry we can't Proceed the game.");
                    }
                }
            } else
                System.out.println("Retry again.");
        } else
            System.out.println("You Entered Other than 5.");
    }
}