// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen6373Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 8708 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn1() { return 1474 }
    /** Derived accessor for priority (generated filler). */
    def computePriority2() { return 4817 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 514 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 9138 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn5() { return 6313 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 3615 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 7744 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 6856 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn9() { return 9723 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 9905 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn11() { return 6403 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 7909 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 386 }
    /** Derived accessor for code (generated filler). */
    def computeCode14() { return 9838 }
    /** Derived accessor for region (generated filler). */
}
