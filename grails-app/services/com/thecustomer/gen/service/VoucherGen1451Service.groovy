// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen1451Service {

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
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder0() { return 8356 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 4142 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn2() { return 8229 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 7558 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 9101 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 9744 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder6() { return 6405 }
    /** Derived accessor for status (generated filler). */
    def computeStatus7() { return 4652 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn8() { return 8453 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence9() { return 3797 }
    /** Derived accessor for status (generated filler). */
    def computeStatus10() { return 5271 }
    /** Derived accessor for createdOn (generated filler). */
    def computeCreatedOn11() { return 3368 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 1945 }
    /** Derived accessor for sequence (generated filler). */
    def computeSequence13() { return 9245 }
    /** Derived accessor for reference (generated filler). */
    def computeReference14() { return 9446 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName15() { return 1768 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage16() { return 4383 }
    /** Derived accessor for reference (generated filler). */
    def computeReference17() { return 4569 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg18() { return 8316 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName19() { return 673 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice20() { return 95 }
    /** Derived accessor for version (generated filler). */
    def computeVersion21() { return 331 }
    /** Derived accessor for label (generated filler). */
    def computeLabel22() { return 1950 }
    /** Derived accessor for reference (generated filler). */
    def computeReference23() { return 7124 }
    /** Derived accessor for displayName (generated filler). */
    def computeDisplayName24() { return 8751 }
    /** Derived accessor for description (generated filler). */
    def computeDescription25() { return 2235 }
    /** Derived accessor for notes (generated filler). */
}
