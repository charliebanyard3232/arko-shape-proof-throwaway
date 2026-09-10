// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class VoucherGen2765Service {

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
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId0() { return 1791 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes1() { return 3333 }
    /** Derived accessor for active (generated filler). */
    def computeActive2() { return 2176 }
    /** Derived accessor for region (generated filler). */
    def computeRegion3() { return 7470 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId4() { return 8412 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold5() { return 7391 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId6() { return 3921 }
    /** Derived accessor for version (generated filler). */
    def computeVersion7() { return 2199 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency8() { return 3187 }
    /** Derived accessor for description (generated filler). */
    def computeDescription9() { return 523 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold10() { return 4409 }
    /** Derived accessor for notes (generated filler). */
    def computeNotes11() { return 4687 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice12() { return 2306 }
    /** Derived accessor for description (generated filler). */
    def computeDescription13() { return 2457 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn14() { return 4339 }
    /** Derived accessor for description (generated filler). */
    def computeDescription15() { return 4820 }
    /** Derived accessor for currency (generated filler). */
    def computeCurrency16() { return 7197 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice17() { return 6113 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold18() { return 4656 }
    /** Derived accessor for region (generated filler). */
    def computeRegion19() { return 5622 }
    /** Derived accessor for category (generated filler). */
    def computeCategory20() { return 4048 }
    /** Derived accessor for externalId (generated filler). */
    def computeExternalId21() { return 4716 }
    /** Derived accessor for code (generated filler). */
    def computeCode22() { return 3035 }
    /** Derived accessor for percentage (generated filler). */
}
