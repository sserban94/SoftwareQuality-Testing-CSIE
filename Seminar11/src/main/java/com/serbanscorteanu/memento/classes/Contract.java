package com.serbanscorteanu.memento.classes;

public class Contract {
    private String clientName;
    private String clauseContract;

    public Contract(String clientName, String clauseContract) {
        this.clientName = clientName;
        this.clauseContract = clauseContract;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClauseContract() {
        return clauseContract;
    }

    public void setClauseContract(String clauseContract) {
        this.clauseContract = clauseContract;
    }

    public void addClause(String newClause){
        this.clauseContract += "\n" + newClause;
    }

    public void restoreFromVersion(String clauseVersion) {
        this.clauseContract = clauseVersion;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "clientName='" + clientName + '\'' +
                ", clauseContract='" + clauseContract + '\'' +
                '}';
    }
}
















