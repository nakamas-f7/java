

public class Veiculo {

    // Atributos
    private boolean carro = false;
    private String nome;
    private String cor;
    private int Ano;
    private double veloatual = 0;
    private double velomaxima = 400;
    private int grau = 0;
    private char direcao;
    private int marcha = 0;

    // proprietario do tipo pessoa
    private Pessoa proprietario;

    
    // metodo ligar
    private void ligar(){
        if(this.carro == false){
            this.carro = true;
            System.out.println("O carro ligou! ");
        }else if(this.carro == true){
            System.out.println("O carro já esta ligado! ");
        }

    }

    // metodo desligar 

    private void desligar(){
        if(this.carro == true){
            this.carro = false;
            System.out.println("O carro desligou! ");
        }else if(this.carro == false){
            System.out.println("O carro já esta desligado! ");
        }

    }

    // metodo acelerar

    private void acelerar(double x){
      if(this.carro == true){
        if(this.veloatual + x <= this.velomaxima){
          this.veloatual += x;
      }else if(this.veloatual + x > this.velomaxima ){
          System.out.println("Voce não pode andar mais do que: " + this.velomaxima + " KM/h");
      }
      }else if(this.carro == false){
        System.out.println("O carro esta desligado");
      }
    }
    
    // metodo frear

    private void frear(double x){
      if(this.carro == true){
        if(this.veloatual >= x){
          this.veloatual -= x;
          System.out.println("Você freou: " + x + " KM");
      }else if(this.veloatual < x){
          System.out.println("impossivel freiar pois você freou mais do que sua velocidade atual: " + this.veloatual);
      } 
      }else if(this.carro == false ){
        System.out.println("Seu carro esta desligado! ");
      }
    }

    //metodo virar

    public void virar(char x, int y){

      // se o carro estiber ligado, ele vai mexer o volante
        if(this.carro == true){





            // se a direÇão que o usuario for D(Direita) o programa executa as condicões abaixo
            if(x == 'D'){
                // se o volante começar em 0 graus, vai ser executado as condições abaixo
                if(this.grau == 0 ){
                  // so executa se o grau solicitado for menor que 90 e maior que 0
                  if(y <= 90 && y > 0 ){
                    this.direcao = x;
                    this.grau += y;
                    System.out.println("Você girou o volante a:  " + this.grau + "° Para a Direita");
                  // caso seja passado um grau maior que a maxima de 90 graus, o programa printa a mensagem abaixo descartando o valor que ultrapassou a maxima e
                  // virando o volante somente ate onde foi permitido
                  }else if(y > 90){
                    System.out.println("O volante só pode ser virado a 90° no maximo, por isso os outros: " + (this.grau + y - 90) + "° Adiionados foram descartados");
                    this.grau += 90;
                  // caso o usuario passe um grau negativo, sera printado o programa a baixo
                  }else if(y < 0){
                    System.out.println("Voê não pode passar valores negativos");
                  }else
                    System.out.println("erro");





                  // se a direção atual for D(Direita) e o grau passado seja maior do que 0 e menor ou igual a 90.
                  }else if(this.direcao == 'D' && this.grau > 0 && this.grau + y <= 90){
                    this.grau += y;
                    System.out.println("Você girou o volante a " + this.grau + "° A direita");
                  // se a direÇão atual for E(Esquerda) e o grau atual for maior que 0.
                  }else if(this.direcao == 'E' && this.grau > 0){
                    if(y - this.grau <= 90 || this.grau - y >= -90){
                      // se o grau atual menos o grau passado pelo usuario for menor que o.
                      if(this.grau - y < 0){
                        this.grau = y - this.grau;
                        this.direcao = 'D';
                        System.out.println("Você voltou o volante a: " + y + "° a direita, atualmente esta a: " + this.grau + "° A direita");
                      // se o grau atual menos o grau passado pelo usuario for maior que 0.
                      }else if(this.grau - y > 0){
                        this.grau += y;
                        System.out.println("Você voltou o volante a: " + y + "° A direita, atualmente esta a: " + this.grau + "° A esquerda");
                      // se p grau atual menos o grau passado pelo usuario for igual a 0.
                      }else
                        this.direcao = '0';
                        System.out.println("Você voltou ao ponto 0°");
                  }else 
                    System.out.println("O grau passado e maior do que o suportado pelo volante, por favor isnsira um grau menor");

                  }else if(this.direcao == 'D' && this.grau > 0 && this.grau + y > 90){
                    System.out.println("você ja chegou ao seu limite de graus a direita, por isso foi adionado: " + (90 - this.grau) + "° a direita, e foram descartados os outros: " + (y - (90 - this.grau) + "°"));
                    this.grau += 90 - this.grau;
                  }else if(this.direcao == 'E' && this.grau == 90 && y > 0 && y <= 90 && this.grau - y > 0){
                    this.grau -= y;
                    System.out.println("Você voltou: " + y + "° a direita e esta a " + this.grau + "° a esquerda");
                  }















                  // se a direÇão que o usuario for E(Esquerda) o programa executa as condicões abaixo
                  }else if(x == 'E'){
                    // se o volante começar em 0 graus, vai ser executado as condições abaixo
                    if(this.grau == 0){
                      // so executa se o grau solicitado for menor que 90 e maior que 0
                      if(y <= 90 && y > 0){
                        this.direcao = x;
                        this.grau += y;
                        System.out.println("Você girou o volante a:  " + this.grau + "° Para a esquerda");
                      // caso seja passado um grau maior que a maxima de 90 graus, o programa printa a mensagem abaixo descartando o valor que ultrapassou a maxima e
                      // virando o volante somente ate onde foi permitido
                      }else if(y > 90){
                        System.out.println("O volante só pode ser virado a 90° no maximo, por isso os outros: " + (this.grau + y - 90) + "° Adiionados foram descartados");
                        this.grau = 90;
                      // caso o usuario passe um grau negativo, sera printado o programa a baixo
                      }else if(y < 0){
                        this.direcao = '0';
                        System.out.println("Você não pode passar um valor negativo");
                      }









                      
                      // se a direção atual for E(Esquerda) e o grau passado seja maior do que 0 e menor ou igual a 90.
                      }else if(this.direcao == 'E' && this.grau > 0 && this.grau + y <= 90){
                        System.out.println("Você girou o volante a " + this.grau + "° A Esquerda");
                        // se a direÇão atual for D(Direita) e o grau atual for maior que 0.
                      }else if(this.direcao == 'E' && this.grau > 0){
                        if(y - this.grau <= 90 || this.grau - y >= -90){
                          // se o grau atual menos o grau passado pelo usuario for menor que o.
                          if(this.grau - y < 0){
                            this.grau = y - this.grau;
                            this.direcao = 'E';
                            System.out.println("Você voltou o volante a: " + y + "° a esquerda, atualmente esta a: " + this.grau + "° A esquerda");
                          // se o grau atual menos o grau passado pelo usuario for maior que 0.
                          }else if(this.grau - y > 0){
                            this.grau += y;
                            System.out.println("Você voltou o volante a: " + y + "° A esquerda, atualmente esta a: " + this.grau + "° A direita");
                          // se p grau atual menos o grau passado pelo usuario for igual a 0.
                          }else
                            this.direcao = 'O';
                            System.out.println("Você voltou ao ponto 0°");


                        }else 
                          System.out.println("O grau passado e maior do que o suportado pelo volante, por favor isnsira um grau menor");
    
                      }else if(this.direcao == 'E' && this.grau > 0 && this.grau + y > 90){
                        System.out.println("você ja chegou ao seu limite de graus a esquerda, por isso foi adionado: " + (90 - this.grau) + "° a esquerda, e foram descartados os outros: " + (y - (90 - this.grau) + "°"));
                        this.grau += 90 - this.grau;
                      }else if(this.direcao == 'D' && this.grau == 90 && y > 0 && y <= 90 && this.grau - y > 0){
                        this.grau -= y;
                        System.out.println("Você voltou: " + y + "° a esquerda e esta a " + this.grau + "° a direita");
                      }

                    
              }








          }else if(this.carro == false){
            System.out.println("O carro está desligado");
          }
        }

        //metodo de marcha 
        public void marcha(){
          if(this.veloatual == 0){
            this.marcha = 0;
            System.out.println("Carro em neutro ");
          }else if(this.veloatual <= this.velomaxima*20/100 && this.veloatual > 0){
            this.marcha = 1;
            System.out.println("Gear Second ");
          }else if(this.veloatual <= this.velomaxima*40/100 && this.veloatual > this.velomaxima*20/100){
            this.marcha = 2;
            System.out.println("Gear Second");
          }else if(this.veloatual <= this.velomaxima*60/100 && this.veloatual > this.velomaxima*40/100){
            this.marcha = 3;
            System.out.println("Gear Third");
          }else if(this.veloatual <= this.velomaxima*80/100 && this.veloatual > this.velomaxima*60/100){
            this.marcha = 4;
            System.out.println("Gear Fourth");
          }else if(this.veloatual <= this.velomaxima*100/100 && this.veloatual > this.velomaxima*80/100){
            this.marcha = 5;
            System.out.println("Gear Five");
          }
        }
        //metodo soltar serve para soltar o volante para voltar ao estado de 0°(virado para frente)
        public void soltar(){
            this.grau = 0;
            this.direcao = ' ';
            System.out.println("Voce voltou a direcao para frente(ponto 0)");
        }



        // setters

        public void setacelera(int x){
          acelerar(x);
        }

        public void setfreia(int x){
          frear(x);
        }

        public void setvira(char x, int y){
          
          if(y <= 90){
            virar(x, y);
          }
        }



        // getters

        public void getliga(){
          ligar();
        }

        public void getdesliga(){
          desligar();

        }


    }

