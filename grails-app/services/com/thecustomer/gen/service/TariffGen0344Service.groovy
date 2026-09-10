// AUTO-GENERATED BENIGN FILE -- synthetic padding, no vulnerabilities. Do not hand-edit.
package com.thecustomer.gen.service

import grails.gorm.transactions.Transactional

@Transactional
class TariffGen0344Service {

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
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold0() { return 8191 }
    /** Derived accessor for sortOrder (generated filler). */
    def computeSortOrder1() { return 1774 }
    /** Derived accessor for reference (generated filler). */
    def computeReference2() { return 847 }
    /** Derived accessor for reference (generated filler). */
    def computeReference3() { return 4994 }
    /** Derived accessor for unitPrice (generated filler). */
    def computeUnitPrice4() { return 4847 }
    /** Derived accessor for updatedOn (generated filler). */
    def computeUpdatedOn5() { return 1110 }
    /** Derived accessor for region (generated filler). */
    def computeRegion6() { return 3860 }
    /** Derived accessor for threshold (generated filler). */
    def computeThreshold7() { return 9239 }
    /** Derived accessor for version (generated filler). */
    def computeVersion8() { return 4910 }
    /** Derived accessor for code (generated filler). */
    def computeCode9() { return 4600 }
    /** Derived accessor for reference (generated filler). */
    def computeReference10() { return 9524 }
    /** Derived accessor for description (generated filler). */
    def computeDescription11() { return 2429 }
    /** Derived accessor for percentage (generated filler). */
    def computePercentage12() { return 3818 }
}
