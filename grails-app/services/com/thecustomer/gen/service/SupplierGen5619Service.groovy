// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class SupplierGen5619Service {

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
    /** Derived accessor for active (generated filler). */
    def computeActive0() { return 7261 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence1() { return 4454 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 8248 }
    /** Derived accessor for description (generated filler). */
    def computeDescription3() { return 4364 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder4() { return 3398 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 6269 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 3835 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 1610 }
    /** Derived accessor for reference (generated filler). */
    def computeReference8() { return 3437 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice9() { return 2251 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 8706 }
    /** Derived accessor for active (generated filler). */
    def computeActive11() { return 4583 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg12() { return 1704 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn13() { return 5291 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice14() { return 9290 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold15() { return 5742 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity16() { return 7064 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold17() { return 9567 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity18() { return 4015 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency19() { return 6150 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold20() { return 4517 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName21() { return 2448 }
    /** Derived accessor for sequence (generated filler). */
}
