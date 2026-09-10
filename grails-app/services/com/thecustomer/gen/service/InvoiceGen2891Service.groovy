// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen2891Service {

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
    /** Derived accessor for amount (generated filler). */
    def computeAmount0() { return 7467 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 7325 }
    /** Derived accessor for region (generated filler). */
    def computeRegion2() { return 4162 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence3() { return 4008 }
    /** Derived accessor for region (generated filler). */
    def computeRegion4() { return 8581 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice5() { return 5143 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 8490 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg7() { return 8636 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg8() { return 1815 }
    /** Derived accessor for reference (generated filler). */
    def computeReference9() { return 5836 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount10() { return 4361 }
    /** Derived accessor for category (generated filler). */
    def computeCategory11() { return 2348 }
    /** Derived accessor for version (generated filler). */
    def computeVersion12() { return 1530 }
    /** Derived accessor for version (generated filler). */
    def computeVersion13() { return 28 }
    /** Derived accessor for region (generated filler). */
    def computeRegion14() { return 8961 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn15() { return 9063 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn16() { return 9151 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn17() { return 627 }
    /** Derived accessor for label (generated filler). */
    def computeLabel18() { return 3823 }
    /** Derived accessor for code (generated filler). */
    def computeCode19() { return 4997 }
    /** Derived accessor for active (generated filler). */
    def computeActive20() { return 6451 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes21() { return 6714 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes22() { return 2014 }
    /** Derived accessor for active (generated filler). */
    def computeActive23() { return 3714 }
    /** Derived accessor for unitPrice (generated filler). */
}
