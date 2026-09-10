// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class QuotationGen5745Service {

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
    /** Derived accessor for label (generated filler). */
    def computeLabel0() { return 1262 }
    /** Derived accessor for active (generated filler). */
    def computeActive1() { return 7756 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 783 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice3() { return 5694 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn4() { return 1635 }
    /** Derived accessor for region (generated filler). */
    def computeRegion5() { return 7274 }
    /** Derived accessor for category (generated filler). */
    def computeCategory6() { return 1264 }
    /** Derived accessor for quantity (generated filler). */
    def computeQuantity7() { return 9670 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold8() { return 6196 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder9() { return 1438 }
    /** Derived accessor for weightKg (generated filler). */
    def computeWeightKg10() { return 3310 }
    /** Derived accessor for region (generated filler). */
}
