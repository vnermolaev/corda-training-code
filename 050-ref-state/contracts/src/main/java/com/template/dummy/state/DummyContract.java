package com.template.dummy.state;

import net.corda.core.contracts.CommandData;
import net.corda.core.contracts.Contract;
import net.corda.core.transactions.LedgerTransaction;
import org.jetbrains.annotations.NotNull;

public class DummyContract implements Contract {

    public static final String DUMMY_CONTRACT_ID = "com.template.dummy.state.DummyContract";

    @Override
    public void verify(@NotNull LedgerTransaction tx) throws IllegalArgumentException {
        // Do nothing
    }

    public interface Commands extends CommandData {
        public class Create implements Commands {
        }
    }
}
