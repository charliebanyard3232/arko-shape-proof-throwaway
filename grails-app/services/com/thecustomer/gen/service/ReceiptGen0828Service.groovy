// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen0828Service {

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
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice0() { return 4906 }
    /** Derived accessor for version (generated filler). */
    def computeVersion1() { return 8691 }
    /** Derived accessor for label (generated filler). */
    def computeLabel2() { return 4887 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg3() { return 9496 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 757 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency5() { return 4375 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn6() { return 6329 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId7() { return 4286 }
    /** Derived accessor for code (generated filler). */
    def computeCode8() { return 4838 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity9() { return 8249 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage10() { return 890 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount11() { return 9807 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes12() { return 4078 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn13() { return 1011 }
    /** Derived accessor for active (generated filler). */
    def computeActive14() { return 3410 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity15() { return 1125 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 4828 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount17() { return 9798 }
}
