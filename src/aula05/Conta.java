package aula05;

public class Conta {

    public int numConta;
    protected String tipoConta;
    private String nomeDono;
    private float saldoConta;
    private boolean status;

    public Conta() {
        this.setStatus(false);
        this.setSaldoConta(0);
    }

    public void estado() {
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getNomeDono());
        System.out.println("Saldo: " + this.getSaldoConta());
        System.out.println("Status: " + this.getStatus());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void abrirConta(String tipo) {
        this.setTipoConta(tipo);
        this.setStatus(true);

        if (tipo == "CC") {
            this.setSaldoConta(50);
        } else if (tipo == "CP") {
            this.setSaldoConta(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldoConta() > 0) {
            System.out.println("Conta não pode ser fechada, pois possui dinheiro");
        } else if (this.getSaldoConta() < 0) {
            System.out.println("Conta não pode ser fechada, pois possui débito");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldoConta(this.getSaldoConta() + v);
            System.out.println("Depósito feito na conta de " + getNomeDono());
        } else {
            System.out.println("Impossível depositar. Conta fechada.");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldoConta() >= v) {
                this.setSaldoConta(this.getSaldoConta() - v);
                System.out.println("Saque realizado na conta de " + this.getNomeDono());
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar. Conta fechada.");
        }
    }

    public void mensalidade() {
        int v = 0;
        if (this.getTipoConta() == "CC") {
            v = 12;
        } else if (this.getTipoConta() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldoConta(this.getSaldoConta() - v);
            System.out.println("Mensalidade paga por " + this.getNomeDono());
        } else {
            System.out.println("Impossível pagar mensal. Conta fechada.");
        }
    }
}
