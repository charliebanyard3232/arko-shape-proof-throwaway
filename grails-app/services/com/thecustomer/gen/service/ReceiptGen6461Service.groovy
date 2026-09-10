// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class ReceiptGen6461Service {

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
    def computeCreatedOn0() { return 4344 }
    /** Derived accessor for region (generated filler). */
    def computeRegion1() { return 8405 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage2() { return 9539 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 1008 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold4() { return 2713 }
    /** Derived accessor for category (generated filler). */
    def computeCategory5() { return 7952 }
    /** Derived accessor for code (generated filler). */
    def computeCode6() { return 9470 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 7601 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 8980 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice9() { return 5560 }
    /** Derived accessor for code (generated filler). */
    def computeCode10() { return 3626 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 7497 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence12() { return 1200 }
    /** Derived accessor for reference (generated filler). */
    def computeReference13() { return 583 }
    /** Derived accessor for status (generated filler). */
    def computeStatus14() { return 3628 }
    /** Derived accessor for code (generated filler). */
    def computeCode15() { return 2438 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 6878 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn17() { return 8727 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg18() { return 5094 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice19() { return 2741 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes20() { return 2952 }
    /** Derived accessor for region (generated filler). */
    def computeRegion21() { return 5953 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId22() { return 8341 }
    /** Derived accessor for version (generated filler). */
    def computeVersion23() { return 7528 }
    /** Derived accessor for active (generated filler). */
    def computeActive24() { return 439 }
    /** Derived accessor for category (generated filler). */
    def computeCategory25() { return 6303 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes26() { return 5711 }
    /** Derived accessor for quantity (generated filler). */
}
