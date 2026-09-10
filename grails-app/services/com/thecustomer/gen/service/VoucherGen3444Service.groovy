// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen3444Service {

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
    def computeAmount0() { return 9194 }
    /** Derived accessor for description (generated filler). */
    def computeDescription1() { return 3748 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 2350 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 8593 }
    /** Derived accessor for reference (generated filler). */
    def computeReference4() { return 934 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 9921 }
    /** Derived accessor for reference (generated filler). */
    def computeReference6() { return 36 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 2458 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 4211 }
    /** Derived accessor for version (generated filler). */
    def computeVersion9() { return 3202 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId10() { return 2401 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency11() { return 7797 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 9764 }
    /** Derived accessor for label (generated filler). */
    def computeLabel13() { return 1620 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage14() { return 7310 }
    /** Derived accessor for status (generated filler). */
    def computeStatus15() { return 571 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder16() { return 1854 }
    /** Derived accessor for reference (generated filler). */
    def computeReference17() { return 8287 }
    /** Derived accessor for version (generated filler). */
    def computeVersion18() { return 1684 }
    /** Derived accessor for status (generated filler). */
    def computeStatus19() { return 7479 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency20() { return 4358 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency21() { return 5841 }
}
