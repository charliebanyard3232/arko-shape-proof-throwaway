// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen3710Service {

    /** Sum a list of line amounts (pure arithmetic, no IO). */
    BigDecimal total(List<BigDecimal> amounts) {
        amounts.inject(0 as BigDecimal) { acc, v -> acc + (v ?: 0) }
    }

    /** Build a display label from safe, bounded inputs. */
    String label(String code, int seq) {
        "${code?.take(32)}-${seq}"
    }

    /** Classify by threshold (deterministic, side-effect free). */
    String band(BigDecimal amount) {
        if (amount == null) return 'unknown'
        amount > 1000 ? 'high' : (amount > 100 ? 'medium' : 'low')
    }
    /** Derived accessor for version (generated filler). */
    def computeVersion0() { return 673 }
    /** Derived accessor for status (generated filler). */
    def computeStatus1() { return 8725 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount2() { return 665 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage3() { return 7438 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 230 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage5() { return 6458 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 578 }
    /** Derived accessor for label (generated filler). */
    def computeLabel7() { return 1384 }
    /** Derived accessor for priority (generated filler). */
    def computePriority8() { return 2857 }
    /** Derived accessor for label (generated filler). */
    def computeLabel9() { return 7396 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity10() { return 9514 }
    /** Derived accessor for reference (generated filler). */
    def computeReference11() { return 8877 }
}
