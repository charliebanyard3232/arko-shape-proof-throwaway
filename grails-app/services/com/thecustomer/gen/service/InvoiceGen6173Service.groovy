// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class InvoiceGen6173Service {

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
    /** Derived accessor for sequence (generated filler). */
    def computeSequence0() { return 8836 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 3331 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes2() { return 4268 }
    /** Derived accessor for active (generated filler). */
    def computeActive3() { return 4257 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity4() { return 7973 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount5() { return 5571 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn6() { return 6370 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage7() { return 6516 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder8() { return 7703 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold9() { return 3637 }
    /** Derived accessor for version (generated filler). */
    def computeVersion10() { return 5903 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice11() { return 3957 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder12() { return 453 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice13() { return 623 }
    /** Derived accessor for label (generated filler). */
    def computeLabel14() { return 5466 }
}
