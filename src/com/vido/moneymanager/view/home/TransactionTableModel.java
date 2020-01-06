package com.vido.moneymanager.view.home;

import com.vido.moneymanager.model.transaction.Transaction;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

class TransactionTableModel extends AbstractTableModel {

    private static final String[] TABLE_COLUMNS = {"Category", "Amount", "Date", "Description"};
    private static final int CATEGORY = 0;
    private static final int AMOUNT = 1;
    private static final int DATE = 2;
    private static final int DESCRIPTION = 3;

    private List<Transaction> transactions = new ArrayList<>();

    @Override
    public int getRowCount() {
        return transactions.size();
    }

    @Override
    public int getColumnCount() {
        return TABLE_COLUMNS.length;
    }

    @Override
    public String getColumnName(int column) {
        return TABLE_COLUMNS[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Transaction transaction = transactions.get(rowIndex);
        switch (columnIndex) {
            case CATEGORY:
                return transaction.getCategoryId();
            case AMOUNT:
                return transaction.getAmount();
            case DATE:
                return transaction.getDate();
            case DESCRIPTION:
                return transaction.getDescription();
        }
        return null;
    }
}
