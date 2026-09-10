// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen0553Service {

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
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn0() { return 70 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency1() { return 416 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg2() { return 7179 }
    /** Derived accessor for category (generated filler). */
    def computeCategory3() { return 4043 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage4() { return 8991 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 5059 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 3720 }
    /** Derived accessor for priority (generated filler). */
    def computePriority7() { return 8745 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence8() { return 1695 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 1940 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 229 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 2308 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity12() { return 8160 }
    /** Derived accessor for code (generated filler). */
    def computeCode13() { return 1464 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency14() { return 4355 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg15() { return 529 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn16() { return 8133 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 6434 }
    /** Derived accessor for version (generated filler). */
    def computeVersion18() { return 3310 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence19() { return 1724 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount20() { return 5544 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency21() { return 3148 }
    /** Derived accessor for priority (generated filler). */
    def computePriority22() { return 5126 }
    /** Derived accessor for priority (generated filler). */
    def computePriority23() { return 2587 }
    /** Derived accessor for status (generated filler). */
    def computeStatus24() { return 7150 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage25() { return 4888 }
    /** Derived accessor for priority (generated filler). */
    def computePriority26() { return 5757 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity27() { return 6421 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes28() { return 8939 }
}
