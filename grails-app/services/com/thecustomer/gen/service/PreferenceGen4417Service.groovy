// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class PreferenceGen4417Service {

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
    /** Derived accessor for category (generated filler). */
    def computeCategory0() { return 8770 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage1() { return 6109 }
    /** Derived accessor for category (generated filler). */
    def computeCategory2() { return 9283 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity3() { return 8359 }
    /** Derived accessor for status (generated filler). */
    def computeStatus4() { return 2790 }
    /** Derived accessor for label (generated filler). */
    def computeLabel5() { return 9470 }
    /** Derived accessor for label (generated filler). */
    def computeLabel6() { return 8305 }
    /** Derived accessor for code (generated filler). */
    def computeCode7() { return 6328 }
    /** Derived accessor for amount (generated filler). */
    def computeAmount8() { return 684 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency9() { return 7628 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 5993 }
    /** Derived accessor for label (generated filler). */
    def computeLabel11() { return 2451 }
    /** Derived accessor for active (generated filler). */
    def computeActive12() { return 7239 }
    /** Derived accessor for category (generated filler). */
    def computeCategory13() { return 7197 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 5787 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency15() { return 6234 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity16() { return 1627 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn17() { return 5023 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder18() { return 3788 }
    /** Derived accessor for status (generated filler). */
    def computeStatus19() { return 4855 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder20() { return 64 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold21() { return 7012 }
    /** Derived accessor for region (generated filler). */
}
